# Datortehnika
Šeit atrodas visi faili saistībā ar datortehnikas web sistēmu

Mājaslapā tiek pieprasīts ierakstīt Datortehnikas nosaukumu un Pamatojumu, kāpēc tas ir nepieciešams, un nospiežot pogu "Pieprasīt" tie dati tiek aizsūtīti uz datu bāzi un saglabāti tur.

Datu bāze šaja momentā nesaglabā pieteikuma reģistrācijas laiku un pieteikumus pašlaik var apskatīt tikai caur pašu datubāzi.

Mājaslapas front-end izveidošanai tika izmantots React.
Back-end izveidošanai tika izmantots Spring Boot.
Prieks Datu Bāzes tika izmantots MySQL.

Ja react mājaslapa atrodas uz cits adreses kā "localhost:3000", tad mapē "datortehnika/controller" failā "DatTehController.java jānomaina pēdiņās ieliktais teksts pie "@CrossOrigin.

Datu bāzes atrašanās vietu, lietotājvārdu un paroli jāmaina mapē "datortehnika/resources" failā "application.properties".

Automātiskā datu bāzes migrēšana un Dockerfile izveidošana man neizdevās.
