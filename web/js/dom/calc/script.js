let memory = 0
function clear(){

}

function put(digit){
    let input = document.getElementById('calculator').firstElementChild;
        input.value += digit 
    input.value = input.value.substring(input.value.length-8)
}

function plus(){
    let input = document.getElementById('calculator').firstElementChild;
    let value = +input.value
    let result = memory + value
}