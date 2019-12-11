import css from './navbar.css'
import html from './navbar.html'

let navbar = () => {
    console.log(css)
    console.log(html)
    document.body.innerHTML += html
}

window.onload = navbar