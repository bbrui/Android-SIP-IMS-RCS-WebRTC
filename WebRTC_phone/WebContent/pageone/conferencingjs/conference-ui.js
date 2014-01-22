﻿/* MIT License: https://webrtc-experiment.appspot.com/licence/ */

//var SIGNALING_SERVER = 'ws://' + "14.98.205.52" + ':8888/';

//var SIGNALING_SERVER = 'ws://' +  + ':8888/';

var SIGNALING_SERVER12 =window.localStorage.getItem('org.doubango.expert.websocket_server_url');
//var string = 'ws://10.1.5.20:8888';

var delimeter = '//';
var splitted =SIGNALING_SERVER12.split(delimeter);


var delimeter1 = ':';
var splitted1 =splitted[1].split(delimeter1);


var SIGNALING_SERVER = 'ws://'+splitted1[0] + ':8888/';


console.log('SIGNALING_SERVER', SIGNALING_SERVER);
var config = {
    openSocket: function (config) {
        config.channel = config.channel || 'default-channel';
        var websocket = new WebSocket(SIGNALING_SERVER);
        websocket.channel = config.channel;
        websocket.onopen = function () {
            websocket.push(JSON.stringify({
                open: true,
                channel: config.channel
            }));

            if (config.callback)
                config.callback(websocket);
        };
        websocket.onmessage = function (event) {
            config.onmessage(JSON.parse(event.data));
        };
        websocket.push = websocket.send;
        websocket.send = function (data) {
            websocket.push(JSON.stringify({
                data: data,
                channel: config.channel
            }));
        };
    },
    onRemoteStream: function (media) {
        var video = media.video;
        video.setAttribute('controls', true);

        participants.insertBefore(video, participants.firstChild);

        video.play();
        rotateVideo(video);
    },
    onRoomFound: function (room) {
        var alreadyExist = document.getElementById(room.broadcaster);
        if (alreadyExist)
            return;

        if (typeof roomsList === 'undefined')
            roomsList = document.body;

        var tr = document.createElement('tr');
        tr.setAttribute('id', room.broadcaster);
        tr.innerHTML = '<td>' + room.roomName + '</td>' + '<td><button class="join" id="' + room.roomToken + '">Join Conference</button></td>';
        roomsList.insertBefore(tr, roomsList.firstChild);

        tr.onclick = function () {
            var tr = this;
            captureUserMedia(function () {
                conferenceUI.joinRoom({
                    roomToken: tr.querySelector('.join').id,
                    joinUser: tr.id
                });
            });
            hideUnnecessaryStuff();
        };
    }
};

function createButtonClickHandler() {
    captureUserMedia(function () {
        conferenceUI.createRoom({
            roomName: (document.getElementById('conference-name') || {}).value || 'Anonymous'
        });
    });
    hideUnnecessaryStuff();
}

function captureUserMedia(callback) {
    var video = document.createElement('video');
    video.setAttribute('autoplay', true);
    video.setAttribute('controls', true);
    participants.insertBefore(video, participants.firstChild);

    getUserMedia({
        video: video,
        onsuccess: function (stream) {
            config.attachStream = stream;
            callback && callback();

            video.setAttribute('muted', true);
            rotateVideo(video);
        },
        onerror: function () {
            alert('unable to get access to your webcam');
            callback && callback();
        }
    });
}

/* on page load: get public rooms */
var conferenceUI = conference(config);

/* UI specific */
var participants = document.getElementById("participants") || document.body;
var startConferencing = document.getElementById('start-conferencing');
var roomsList = document.getElementById('rooms-list');

if (startConferencing)
    startConferencing.onclick = createButtonClickHandler;

function hideUnnecessaryStuff() {
    var visibleElements = document.getElementsByClassName('visible'),
    length = visibleElements.length;
    for (var i = 0; i < length; i++) {
        visibleElements[i].style.display = 'none';
    }
}

function rotateVideo(video) {
    video.style[navigator.mozGetUserMedia ? 'transform' : '-webkit-transform'] = 'rotate(0deg)';
    setTimeout(function () {
        video.style[navigator.mozGetUserMedia ? 'transform' : '-webkit-transform'] = 'rotate(360deg)';
    }, 1000);
}
(function () {
    var uniqueToken = document.getElementById('unique-token');
    if (uniqueToken)
        if (location.hash.length > 2)
            uniqueToken.parentNode.parentNode.parentNode.innerHTML = '<h2 style="text-align:center;"><a href="' + location.href + '" target="_blank">Share this link</a></h2>';
        else
            uniqueToken.innerHTML = uniqueToken.parentNode.parentNode.href = '#' + (Math.random() * new Date().getTime()).toString(36).toUpperCase().replace(/\./g, '-');
    })();
