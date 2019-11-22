//координаты пэкмана

var pacx = 150
var pacy = 150

//координаты бомбы
var tntx = 50
var tnty = 50

function clearMap() {
    var map = document.getElementById("map")    //поиск элемента по id
    map.innerHTML = ''
}
function drawPacman() {
    var map = document.getElementById("map")    //поиск элемента по id
    map.innerHTML += `<div class="pac" style="left:${pacx}px;top:${pacy}px;" ></div>`   //вносим изменения в структуру html
}
function drawTnt() {
    var map = document.getElementById("map")    //поиск элемента по id
    map.innerHTML += `<div class="tnt" style="left:${tntx}px;top:${tnty}px;" ></div>`   //вносим изменения в структуру html
}
function detectBomb() {
    if (pacx == tntx & pacy == tnty) {
        alert("Game over!");
    }
}

function moveLeft() {
    if (pacx <= 0) {
        pacx = 450;
    }
    else {
        pacx -= 50
    }

    clearMap()
    drawPacman()
    drawTnt()
    detectBomb()
}
function moveRight() {
    if (pacx >= 450) {
        pacx = 0;
    }
    else {
        pacx += 50;
    }

    clearMap()
    drawPacman()
    drawTnt()
    detectBomb()
}
function moveUp() {
    if (pacy <= 0) {
        pacy = 450;
    }
    else {
        pacy -= 50
    }

    clearMap()
    drawPacman()
    drawTnt()
    detectBomb()
}
function moveDown() {
    if (pacy >= 450) {
        pacy = 0;
    }
    else {
        pacy += 50
    }

    clearMap()
    drawPacman()
    drawTnt()
    detectBomb()
}

function move() {
    console.log(event.code) // переменная содержит информацию о только что произошедшем событии(клик,прокрутка и тд.)
    switch (event.code) {
        case "ArrowUp": moveUp(); break;
        case "ArrowDown": moveDown(); break;
        case "ArrowRight": moveRight(); break;
        case "ArrowLeft": moveLeft(); break;
    }
}

clearMap()
drawPacman()
drawTnt()