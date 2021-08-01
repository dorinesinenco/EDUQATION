## Chestionar pe COMPONENT

RASPUNDETI LA URMATOARELE INTREBARI:

1. Ce numim o componenta in react?
2. Cum "fabricam" o componenta?
3. Rescrieti acest cod ```<MyComponent property="value" />``` fara utilizarea sintaxei JSX
4. Ce reprezinta "props" in terminologia react?
5. Atunci cand intr-o componenta trebuie transmisa o valoare fixa in template, care din urmatoarele doua variante este sintaxa corecta (cu argumente):
  a. ```<MyComponent value=1000 />  ```
  b. ```<MyComponent value="1000" />  ```
  c. ```<MyComponent value={1000} />  ```
6. In ce caz o componenta in JSX este scrisa cu PAIRED TAG?  
7. Rescrieti urmatorul cod (unde componenta Child este inclusa in componenta Parent de 3 ori) utilizand doar SINGLE TAG pentru "Parent"!!! in JSX
  ```js
  function Child(props) { 
    return (<div>This is the {props.name} child!)</div>)
  }
  
  function Parent(props) { 
    return (<div>{props.children}</div>)
  }
  
  // main component, rewrite the code here
  function App() {
    return (
      <div>
        <Parent>
          <Child name="One"/>
          <Child name="Two"/>
          <Child name="Three"/>
        </Parent>
      </div>
    )
  }

  ```
8. Aveti urmatorul cod, rescrieti codul astfel incat proprietatea transmisa "customContent" sa se numeasca "custom-content"
    ```js
      function MyComponent(props) { 
        return (<div>{props.customContent}</div>)
      }

      

      // main component, rewrite the code here
      function App() {
        return (
          <div>
            <MyComponent customContent="This is some text for testing!"/>
          </div>
        )
      }
    ```
  
