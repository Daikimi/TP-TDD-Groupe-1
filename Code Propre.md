#Code Propre

##Pour que le code soit propre, le code doit être :

- Valide
- Sans redondances
- Explicite
- Minimal

##règles de base :

- Noms clairs
- longueurs maximales de 20 lignes de code pour chaque méthode
- SE RELIRE ou FAIRE RELIRE
- Boy Scout : ouvrir le fichier et refermer en ayant améliorer le code
- pas de commentaires
- utiliser des Exceptions et pas de valeurs spéciales
- pas de variable globale
- Ne pas conserver les valeurs de retour que vous n'utilisez pas

##Exemple :
- noms:
Mauvais code:
```C
 Customer[] customerList;
 Table theTable;
 ```
Code Propre :
```C
 Customer[] customers;
 Table customers;
 ```
 -notation:
Mauvais code:
```C
const int maxcount = 1
bool change = true
public interface Repository
private string NAME
public class personaddress
void getallorders()
```
Code Propre:
```C
const int MAXCOUNT = 1
bool isChanged = true
public interface IRepository
private string _name
public class PersonAddress
void GetAllOrders()
```
