# Programmeringskonkurranse

## Oppgave 1 - Karpekars tall

Start med et tall mellom 1 og 9999 der ikke alle siffer er like. I denne oppgaven skal alle tall ha fire siffer så fyll på med 0 hvis det trengs (f. eks. 11 blir 0011 og har dermed ikke alle siffer like). Sorter de fire sifferene i synkende og i stigende rekkefølge og subtrahere disse to tallene for å få et nytt tall. Hvis man gjentar dette lenge nok kommer man alltid til 6174 som er det eneste tallet som gir seg selv. Dette tallet kalles Kaprekars tall.

Skriv et program som leser inn et tall å starte med og skriver ut hvor mange steg det tar før man kommer til 6174.

### Eksempel 1:
- Start: 2687
- Antall steg: 7
- (2687 -> 6084 -> 8172 -> 7443 -> 3996 -> 6264 -> 4176 -> 6174)

### Eksempel 2:
- Start: 7
- Antall steg: 4
- (7 -> 6993 -> 6264 -> 4174 -> 6174)

## Oppgave 2 - Bussjåfører

Færre tar buss på grunn av pandemien og AtB sliter med lønnsomheten. De ønsker å effektivisere turnusen til sjåførene og trenger din hjelp. Alle sjåfører jobber 4 dager i strekk og har så fri i 3 dager, men de kan starte på ulike dager. En sjåfør kan f. eks. jobbe mandag-tordag mens en annen kan jobbe lørdag-tirsdag (helger behandles likt som ukedager i denne oppgaven).

Rutetidene for bussene og mengden passajerer er ikke samme hver dag så det trengs ulike antall sjåfører på jobb hver dag.

Skriv et program som spør etter hvor mange sjåfører som trengs hver dag og beregner det minste antallet sjåfører som trenger være ansatt. Antallet sjåfører som trengs en dag vil aldri være fler enn 200.

### Eksempel 1:
- Mandag:  1
- Tirsdag: 2
- Onsdag:  2
- Torsdag: 2
- Fredag:  2
- Lørdag:  2
- Søndag:  1

Antall sjåfører: 3

F. eks. 1 starter tirsdag, 1 starter onsdag, 1 starter lørdag

### Eksempel 2:
- Mandag:  7
- Tirsdag: 10
- Onsdag:  2
- Torsdag: 4
- Fredag:  5
- Lørdag:  2
- Søndag:  1

Antall sjåfører: 11

F. eks. 5 starter mandag, 4 starter tirsdag, 1 starter fredag, 1 starter lørdag

### Eksempel 3:
- Mandag:  48
- Tirsdag: 81
- Onsdag:  75
- Torsdag: 76
- Fredag:  76
- Lørdag:  59
- Søndag:  73

Antall sjåfører: 122

## Oppgave 3 - Sortere kort

Ola liker å spille kort. Han synes noen kortspill slutter litt for raskt og har derfor kommet på at han kan legge sammen flere kortstokker når han spiller. Dette fører til at man noen ganger får veldig mange kort på handen. For å få oversikt over sine kort ønsker Ola å sortere dem. Det gjør han gjennom å gjentatte ganger flytte et kort fra en plass i kortrekken til en annen. Alle kort har en verdi mellom 1-13 og skal sorteres i stigende rekkefølge. Vi ser ikke på fargen på kortene i denne oppgaven.

Skriv et program som beregner det minste antallet kort som Ola trenger å flytte for å sortere en gitt rekke med kort.

### Input:
Input leses fra fil. På første rad i filen står et heltall (n < 1000000) som er antall kort. På neste rad står n heltall (separert med mellomrom) for verdien på kortene (1-13).

### Eksempel 1:
Kortrekken [2, 5, 3, 12, 13, 11] kan sorteres gjennom å flytte 2 kort. Flytte 5 til mellom 3 og 12, flytte 11 til mellom 5 og 12.

### Eksempel 2:
[1, 5, 5, 4, 7] kan sorteres gjennom å flytte 1 kort (4).
