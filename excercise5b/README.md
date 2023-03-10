### Pete vježbe, drugi zadatak
Napisati Java program kojim se vodi statistika troškova jednog preduzeća. Preduzeće ima dva tipa izdataka, izdatke na plate i izdatke na materijalne troškove. Konstruisati apstraktnu klasu `Employee` i javnu klasu `MaterialCost`. Iz klase `Employee` izvesti klase `Manager` i `Warehouseman`. Klasa `Manager` ima sljedeće podatke članove: `name`, `surname`, `coefficient`, `minimumWage`, `supplement` i `bonus`, dok su podaci članovi klase `Warehouseman`: `name`, `surname`, `coefficient`, `minimumWage`, `norm` i `hours`. Materijalni troškovi opisani su sljedećim podacima: `description`, `quantity` i `unitPrice`. Sve klase posjeduju metodu `amount` koja će vraćati iznos troška. Plata rukovodioca se obračunava po formuli:  
<p align="center">
`salay = coefficient * minimumWage * (1 + bonus + supplement)`
</p>  
dok se plata magacionera obračunava kao:
<p align="center">
`salay = coefficient * minimumWage * (hours < norm) ? (0.8) : (1 + (hours - norm)/100).`
</p>  
