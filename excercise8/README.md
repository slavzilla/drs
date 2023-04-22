### Osme vježbe
Tekstualni fajl vehicles.txt sadrži podatke o automobilima (vidjeti Tabelu 1). Jedan red fajla predstavlja podatke o jednom automobilu, pri čemu su svaka dva susjedna podatka razdvojena karakterom '#'.  
Potrebno je:
- Kreirati klasu `Vehicle` koja će modelovati automobil. Podaci klase su dati u kolonama tabele (`brand`, `model`, `productionYear`, `capacity`, `mileage`, `price`). Klasa treba da sadrži podrazumijevani konstruktor, konstruktor sa svim podacima, inspektore, mutatore i metodu `toString` koja vraća string sa svim podacima o automobilu. U slučaju unosa nedozvoljenih podataka (negativne vrijednosti za kubikažu, kilometražu i cijenu, godište manje od 1950 ili veće od 2023) baciti izuzetak tipa `IllegalArgumentException`.  
- Otvoriti fajl vehicles.txt i za svaki red fajla kreirati jednu instancu klase `Vehicle`. Kreirane instance smjestiti u kolekciju po želji.  
- Koristeći mapu, odrediti i odštampati koliko ima automobila svake marke na sljedeći način:  
Audi 7  
BMW 4  
Dacia 2  
...  

<div align="center">
<table>
        <thead>
            <tr>
                <th>Marka</th>
                <th>Model</th>
                <th>Godište</th>
                <th>Kubikaža</th>
                <th>Kilometraža/1000</th>
                <th>Cijena</th>
            </tr>
        </thead>
        <tbody>
            <tr>			
                <td>Volkswagen</td>
                <td>Golf7</td>
                <td>2012</td>
                <td>1600</td>
                <td>140.1</td>
                <td>8500</td>
            </tr>
            <tr>			
                <td>Audi</td>
                <td>A6</td>
                <td>2009</td>
                <td>3000</td>
                <td>180.5</td>
                <td>9000</td>
            </tr>
            <tr>			
                <td>BMW</td>
                <td>320</td>
                <td>2007</td>
                <td>2000</td>
                <td>221.7</td>
                <td>8000</td>
            </tr>
            <tr>
                <td>Toyota</td>
                <td>Yaris</td>
                <td>2019</td>
                <td>2019</td>
                <td>34.3</td>
                <td>14000</td>
            </tr>
            <tr>
                <td>Mercedes</td>
                <td>E320</td>
                <td>2008</td>
                <td>3200</td>
                <td>321.5</td>
                <td>6800</td>
            </tr>
            <tr>				
                <td>Volkswagen</td>
                <td>Passat</td>
                <td>2007</td>
                <td>1900</td>
                <td>120.9</td>
                <td>7300</td>
            </tr>
            <tr>	
                <td>Dacia</td>
                <td>Logan</td>
                <td>2020</td>
                <td>999</td>
                <td>2.3</td>
                <td>8700</td>
            </tr>
        </tbody>
</table>
<p style="text-align:center">Tabela 1. Tekstualni fajl vehicles.txt. Kilometraža je data u hiljadama kilometara.</p>
</div>