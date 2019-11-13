## Operarea cu modulele avansate NodeJS, utilizarea imports / exports si babel

> Babel permite transpilarea codului modern intr-un cod compatibil cu platforma pe care acesta trebuie rulat.

* Scopul exemplului esta sa se faca o aplicatie, care citeste automat o lista de potentiali "clienti" si trimite un nou email, automat acestor clienti.



1. Instalati "nodemailer" si "babel"
2. creati mapa "src/" - unde se va pastra sursa in format modern (ES7,ES8+)
3. creati mapa "build/" - aici babel-u va plasa codul transpilat si tot de aici node-ul va lansa aplicatia finala
4. creati fisierul de configurare .babelrc si instalati presetul "preset-env" pentru ca acesta sa se adapteze la versiunea nodejs pe care o aveti pe serverul unde developati si rulati aceasta aplicatie
5. creati mapa "data/" si in ea fisierul "mailing.lists.json" cu asa un format
    ```json
    [
        { "name": "John Doe", "mail": "j.doe@gmail.com" },
        ....
    ]
    ```
6. ATENTIE, pentru a testa aceasta aplicatie, veti avea nevoie de 2-3 adrese de email reale! Multi developeri isi creaza 2-3 conturi de email pentru a face experimente, exista si platforme automatizate. Cei care stiu cum sa isi instaleze "servere de email" locale, pot testa de pe ele. In cazul incepatorilor cea mai buna varianta este prima. Creati-va si pastrati parolele a 2-3 conturi pentru development (va vor prinde bine ;) ). Redactati mailing.lists asa incat acesta sa contina adresele si numele casutelor postale respective!    

7. Creati un fisier numit "worker.js" in folderul sursa (in development deseori "worker" este numit un script care indeplineste anumite task-uri pe fundal)
8. In worker - importati prin metoda moderna "nodemailer" (documentatia oficiala o gasiti aici https://nodemailer.com/)
9. Un "mailer" nu poate transmite de la sine direct mesajele pe diverse servere de email din lume, de aia de obicei ceste module folosesc (se configureaza sa foloseasca) anumite metode de TRANSPORT (https://nodemailer.com/transports/), cea mai simpla ar fi varianta "sendmail" (https://nodemailer.com/transports/sendmail/) dar pentru aceasta in Windows va trebui sa instalati aceasta componenta si sa configurati antivirusul si firewall-ul sa permita porturile prin care ies emailurile sa fie deblocate. O alta varianta ar fi sa folositi transportul prin SMTP (https://nodemailer.com/smtp/) - un protocol specializat pentru transport de email-uri, si puteti folosi drept baza un account de GOOGLE - de pe care sa trimiteti email. Cum se configureaza gmail + nodemailer smtp puteti cauta in google (iata un thread tare bun - raspunsurile de mai jos - https://stackoverflow.com/questions/19877246/nodemailer-with-gmail-and-nodejs)

10. Codul in worker.js trebuie scris utilizand **Promises** sau **async/await** astfel incat acesta sa indeplineasca urmatoarele actiuni:
    1.  Sa citeasca asincron fisierul cu lista de emailuri - imediat ce se lanseaza aplicatia
    2.  DUPA aceasta sa parseze JSON-ul si sa plaseze lista de contacte intr-un Array
    3.  DUPA aceasta sa seteze un timer cu intervalul random intre 10 si 30 de secunde care va apela o functie ce se va comporta in felul urmator:
        1.  Va trimite un email pe prima adresa din Array, si se va misca pe urmatoarea pozitie, apoi va astepta urmatorul timer
        2.  Cum vine urmatorul apel al timerului functia va trimite inca un email pe adresa de pe pozitia curenta, apoi se va misca iar pe pozitia urmatoare in Array - am putea numi acest algoritm - iteratie cu delay. Acest lucru este necesar pentru ca serviciile care transporteaza emailurile noastrea sa nu considere ca este un SPAM sau ATTACK, ca sa arate procesul cat mai natural - intervalul ar trebui setat cam la 100-300 de secunde, doar ca atat timp cat testam nu prea avem la dispozitie atata timp ;)
    4.  Daca veti citi documentatia / exemplul de pe prima pagina a nodemailer, veti vedea ca acesta e deja gata sa fie folosit cu async/await, promiseuri, si functia de expediere ".sendMail()" returneaza asincron informatia referitor la eroare/succes-ul transportarii, de aia la acest punct mai adaugati un PAS - scriptul tre sa astepte de fiece data rezultatul transportarii emailului si sa il afiseze in console.log()    
