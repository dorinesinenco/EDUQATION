## Referinta scurta pentru diverse functii din biblioteca "string.h"

1. void * memchr const void * str, int c, size_t n)
    Căutări pentru prima apariție a caracterului c (un nescris) în primii n octeți ai șirului indicat, de argumentul str.

2. int memcmp(const void * str1, const void * str2, size_t n)
    Compara primii n octeți de str1 și str2.

3. void * memcpy (void * dest, const void * src, size_t n)
    Copiază n caractere de la src la dest.

4. void * memmove (void * dest, const void * src, size_t n)
    O altă funcție de a copia n caractere de la str2 la str1.

5. void * memset (void * str, int c, size_t n)
    Copiază caracterul c (un nescris) în primele n caractere ale șirului indicat de argumentul str.

6. char * strcat (char * dest, const char * src)
    Anexează șirul indicat, prin src la capătul șirului indicat de dest.

7. char * strncat (char * dest, const char * src, size_t n)
    Anexează șirul indicat, prin src până la capătul șirului indicat, prin dest până la n caractere lungi.

8. char * strchr (const char * str, int c)
    Căutări pentru prima apariție a caracterului c (un nescris) în șirul indicat de argumentul str.

9. int strcmp (const char * str1, const char * str2)
    Compara șirul indicat, cu str1 cu șirul indicat cu str2.

10. int strncmp (const char * str1, const char * str2, size_t n)
    Compara cel mult primii n octeți de str1 și str2.

11. int stroll (const char * str1, const char * str2)
    Compara șirul str1 cu str2. Rezultatul depinde de setarea LC_COLLATE a locației.

12. char * strcpy (char * dest, const char * src)
    Copiază șirul indicat de src către dest.

13. char * strncpy (char * dest, const char * src, size_t n)
    Copiază până la n caractere din șirul indicat, de către src la dest.

14. size_t strcspn (const char * str1, const char * str2)
    Calculează lungimea segmentului inițial al str1 care constă în totalitate din caractere care nu sunt în str2.

15. char * strerror (int errnum)
    Căuta un tablou intern pentru numărul de eroare errnum și returnează un pointer la un șir de mesaje de eroare.

16. size_t strlen (const char * str)
    Calculează lungimea șirului de caractere până la care nu include caracterul nul terminant.

17. char * strpbrk (const char * str1, const char * str2)
    Găsește primul caracter din șirul str1 care se potrivește cu orice caracter specificat în str2.

18. char * strrchr (const char * str, int c)
    Căutări pentru ultima apariție a caracterului c (un nescris) în șirul indicat de argumentul str.

19. size_t strspn (const char * str1, const char * str2)
    Calculează lungimea segmentului inițial al str1 care constă în totalitate din caractere în str2.

20. char * strstr (const char * hastack, const char * ac)
    Găsește prima apariție a întregului ac de coardă (fără a include caracterul nul care se termină) care apare în fagurele cu șiruri.

21. char * strtok (char * str, const char * delim)
    Îndepărtează șirul într-o serie de jetoane separate prin delimitare.

22. size_t strxfrm (char * dest, const char * src, size_t n)
    Transformă primele n caractere ale șirului src în locale locale și le plasează în șirul dest.