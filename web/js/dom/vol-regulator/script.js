let volume = 50
function render(){
    let screen = document.getElementById('player').firstElementChild;
    let slider = document.getElementById('player').children[1].children[1];
    screen.value = volume
    slider.value = volume
}

function up(){
   volume++
   render()
}

function down(){
    // ???
}

function change(){
    // ???
}