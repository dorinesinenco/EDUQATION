let btn = document.querySelector('button')
let likes = 0

let like = () => {
    likes++
    if (likes > 0) {
        btn.classList.remove("off")
        btn.classList.add("on")
    }
    //    console.log( likes ) 
    btn.innerHTML = `Likes ${likes}`
}