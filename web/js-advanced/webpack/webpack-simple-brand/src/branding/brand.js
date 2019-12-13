import css from './brand.css'
import html from './brand.html'
import logo from './brand.svg'

let navbar = () => {
    console.log(css)
    console.log(html)
    console.log(logo)
    document.body.innerHTML += html
    document.getElementsByClassName('logo')[0].innerHTML = logo
    document.getElementsByClassName('logo')[0].classList.add('rot')
}

window.onload = navbar