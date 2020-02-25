class LikeButton {

    constructor( element , likes  = 0 ){
        this.likes = likes;
        this.element = element;
        this.element.addEventListener('click', this.like.bind(this) ) 
    }

    like(){
        this.likes++;
        this.render();
       // console.log(this)
    }

    render(){
        // ???
        this.element.innerHTML = `Likes: ${this.likes}`
    }

}