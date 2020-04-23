# TDT4145_prosjekt

Vi ønsker å designe og implementere en database som lagrer informasjon om filmer, serier, skuespillere og utgivelsesselskaper. Som en inspirasjon til oppgaven kan man titte på IMDB på internett.  
   
Filmer kan opprinnelig være laget for kino, TV eller streaming. Filmer kan også være serier med mange episoder og sesonger. Filmene kan også bli utgitt på video. Filmer finnes i forskjellige kategorier, slik som krim, drama, fantasi, SciFi, grøsser, romanse, familie, barn, etc. En film kan ha flere kategorier, for eksempel SciFi og barn. En film har en eller flere regissører. En film har tittel, regissører, manusforfattere, lengde, utgivelsesår, lanseringsdato og en beskrivelse av innhold (eng. storyline). Serier er mer kompliserte med mange regissører, manusforfattere, skuespillere osv. som har ansvar for eller spiller i en eller flere episoder. Det er også musikk knyttet til filmer. Vi vil gjerne vite hvem som har komponert og framført musikken.  
  
Skuespillere har navngitte roller i filmer. Vi ønsker å vite hvilke roller skuespillere har i de forskjellige filmene. Vi ønsker også å vite navn, fødselsår og fødselsland for skuespillere, regissører og manusforfattere. Manusforfattere og regissører kan også være skuespillere i filmer de har laget. For selskaper vet vi både URL, adresse og land.  
  
Databasen har også registrerte brukere som kan kommentere og anmelde filmer, serier, episoder osv. De skal kunne sette inn tekster som anbefaler filmer, episoder osv, og som inkluderer en rating som går fra 1 til 10.  

Databasen skal blant annet kunne brukes for å gjøre følgende (usecase):  
1. Finne navnet på alle rollene en gitt skuespiller har.  
2. Finne hvilke filmer som en gitt skuespiller opptrer i.  
3. Finne hvilke filmselskap som lager flest filmer inne hver sjanger (grøssere, familie, o.l.).  
4. Sette inn en ny film med regissør, manusforfattere, skuespillere og det som hører med.  
5. Sette inn ny anmeldelse av en episode av en serie.  
