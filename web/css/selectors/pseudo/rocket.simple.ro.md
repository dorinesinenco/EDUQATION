## Utilizarea selectorilor pseudo

---

* avand la dispozitie acest cod

```html
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .sky {
            background-image: url(https://icons.iconarchive.com/icons/goodstuff-no-nonsense/free-space/128/rocket-icon.png);
            /*
              background-???:???;
            */

            background-color: #569;
            height: 800px;
            width: 500px;
        }
        /*
          ???:??? {
              ???: ???;
          }
        */
    </style>
</head>

<body>


    <div class="sky">
        <div class="cloud"><img src="https://icons.iconarchive.com/icons/flaticonmaker/flat-style/128/cloud-icon.png" alt=""></div>
        <div class="cloud"><img src="https://icons.iconarchive.com/icons/flaticonmaker/flat-style/128/cloud-icon.png" alt=""></div>
        <div class="cloud"><img src="https://icons.iconarchive.com/icons/flaticonmaker/flat-style/128/cloud-icon.png" alt=""></div>
        <div class="cloud"><img src="https://icons.iconarchive.com/icons/flaticonmaker/flat-style/128/cloud-icon.png" alt=""></div>
        <div class="cloud"><img src="https://icons.iconarchive.com/icons/flaticonmaker/flat-style/128/cloud-icon.png" alt=""></div>    
    </div>

</body>

</html>
```

* completati locurile lipsa pentru ca obtine urmatorul rezultat 
* NOTA: utilizati pseudo selectorii structurali
* NOTA: utilizati lucrul cu proprietatea background-*

![image](https://user-images.githubusercontent.com/4667821/109600196-58473480-7b25-11eb-9481-d275edc1f9ef.png)
