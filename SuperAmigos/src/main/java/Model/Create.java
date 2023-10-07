/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.awt.Point;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Create {
    //Para generar un número aleatorio
    private Random random = new Random();
    //Listas de nombres para la creación aleatoria
    private ArrayList<String> names;
    //Lista de apellidos aleatorios
    private ArrayList<String> surname;
    //Lista de paises aleatorios
    private ArrayList<String> countries;
    //Se crea un singleton para tener una unica instancia de la clase 
    private static Create instance;
    //ArrayListt para guardar personas
    private ArrayList<Person> personList = new ArrayList<Person>();
    //ArrayList para guardar los superhumanos
    private ArrayList<Hero> heroesList = new ArrayList<Hero>();
    //ArrayList de artefactos
    private ArrayList<Device> DeviceList = new ArrayList();
    //ArraysList para crear nombres de heroes aleatoriamente
    private ArrayList<String> heroName = new ArrayList<String>();
    private ArrayList<String> heroName2 =  new ArrayList<String>();
    //Contador para generar personas random (entre 10 y 20 personas) sin hijos y solteros
    private int cont = random.nextInt(11)+10;
    //El constructor es privado para que solo pueda acceder a través del metodo getInstace y asi solo crear una instancas de la clase
    private Create(){
        inicializeNames();
        inicializeSurname();
        inicializeCountries();
        addDevices();
        addHeroName();
    }
    //Se crea la persona y se agrega a la lista
    public void createPerson(String name, String country, float age, boolean availability, boolean single,
            String address, float scaleOfEvil, float weight, float height, boolean physicalProblems,
            boolean mentalProblems, int numOfChild){
        Person person = new Person(name,country, age, availability, single, address, scaleOfEvil, weight,
        height, physicalProblems, mentalProblems,numOfChild);
        personList.add(person);
        
    }
    
    //Se clasifican las personas y se crean los heroes con aquellas que cumplen
    public void createHero(){
        Person person;
        for(int i = 0; i<personList.size();i++){
            person = personList.get(i);
            if(clasificate(person)){
                Point point = new Point(0,0);
                Hero hero = new Hero(JOptionPane.showInputDialog(null, "Ingrese el super nombre de "+
                        person.getName(), "Super nombre", 1),person.getWeight()*10,20,DeviceList.get(random.nextInt(4)),
                        false,false,false,false,false,point, 100,person);
                addToListHero(hero);
                personList.remove(person);
                i--;
            }
        }  
    }

    //Genera herores con nombres aleatorios
    public void createHeroRandom(){
        Person person;
        for(int i = 0; i<personList.size();i++){
            person = personList.get(i);
            if(clasificate(person)){
                Point point = new Point(0,0);
                Hero hero = new Hero(heroName.get(random.nextInt(29))+" "+
                        heroName2.get(random.nextInt(29)),person.getWeight()*10,20,DeviceList.get(random.nextInt(4)),
                        false,false,false,false,false,point, 100,person);
                addToListHero(hero);
                personList.remove(person);
                i--;
            }
        }
    }
    //Crea la liista de artefactos que los heroes pueden tener
    private void addDevices(){
        Device device1 = new Device("Gafas rayos UV",20,100,20,"Rayos UV");
                Device device2 = new Device("Shampoo H&S", 0, 0, 0, "H&S");
                Device device3 = new Device("Pistola de rayos Gamma", 10, 120, 10, "Rayos Gamma");
                Device device4 = new Device("Cortadora a pulso de Vinagre", 0, 60, 10, "Vinagre");
                DeviceList.add(device1);
                DeviceList.add(device2);
                DeviceList.add(device3);
                DeviceList.add(device4);
    }
    //Clasifica las personas
    private boolean clasificate(Person person){
        return((person.getScaleOfEvil()<=2)&&person.isAvailability()&&!person.getMentalProblems()
                &&!person.getPhysicalProblems());
    }
    //Agregar heroe a la lista
    private void addToListHero(Hero hero){
        heroesList.add(hero);
    }
    //Imprime la lista de heroes
    public String printHeroes(){
        if(heroesList.size()==0){
            return"No se han creado personas.\nPrimero cree personas para poder realizar la clasificación";
        }
        String result="Hay "+heroesList.size()+" actualmente y son: \n------------\n";
        for(Hero hero: heroesList){
            result+=hero.toString();
            result+="\n------------\n";
        }
        return result;
    }
    //Imprime la lista de personas que hay registradas
    public String printPersons(){
        String result="";
        result+= "-------------------------------\n";
        for(Person person: personList){
            result+= person.toString();
            result+= "-------------------------------\n";
        }
       return result;
    }
    //metodo para crear la lista de los alfis
    public ArrayList<Alfis> createAlfi(int n){
       ArrayList<Alfis> alfisList = new ArrayList<>();
       for(int i = 0; i <n; i++){
           Alfis alfi = new Alfis("Soldado colonizador N° "+Integer.toString(random.nextInt(100)), random.nextInt(100)+350);
           alfisList.add(alfi);
       }
       return alfisList;
    }
    //Metdoo para obetenr la lista de personas que se han registrado
    public ArrayList<Person> getArray(){
        return personList;
    }
    //Metodo para obtener la lista de los heroes
    public ArrayList<Hero> getHeroArray(){
        return heroesList;
    }
    //Metodo para obtener y crear (de ser necesario) la unica instancia de la clase
    public static Create getInstance(){
        if(instance == null){
            instance = new Create();
        }
        return instance;
    }
    //Metodo para generar una persona random
    public void randomPersons(int n){
        for(int i =0; i<n;i++){ 
            if(cont>0){
                cont--;
                createPerson(getName(),getCountry(),random.nextInt(43)+18,true,
                    true,getAddress(),random.nextInt(2),random.nextInt(61)+60,
                    random.nextInt(51)+150,false,false,0);
                continue;
            }
            createPerson(getName(),getCountry(),random.nextInt(43)+18,true,
                    random.nextBoolean(),getAddress(),random.nextInt(5),random.nextInt(61)+60,
                    random.nextInt(51)+150,false,false,random.nextInt(4)+1);
        }
    }
    //Obtiene un nombre al azar del array
    private String getName(){
        return names.get(random.nextInt(30))+" "+surname.get(random.nextInt(30));
    }
    //obtiene un pais al alzar del array
    private String getCountry(){
        return countries.get(random.nextInt(30));
    }
    //inicializa el array de nombres
    public void inicializeNames(){
        names = new ArrayList<String>();
        names.add("Juan");
        names.add("María");
        names.add("Carlos");
        names.add("Laura");
        names.add("Pedro");
        names.add("Ana");
        names.add("Luis");
        names.add("Sofía");
        names.add("Javier");
        names.add("Lucía");
        names.add("Miguel");
        names.add("Isabel");
        names.add("David");
        names.add("Elena");
        names.add("José");
        names.add("Carmen");
        names.add("Fernando");
        names.add("Silvia");
        names.add("Rafael");
        names.add("Patricia");
        names.add("Pablo");
        names.add("Alicia");
        names.add("Daniel");
        names.add("Beatriz");
        names.add("Alejandro");
        names.add("Eva");
        names.add("Manuel");
        names.add("Natalia");
        names.add("Adrián");
        names.add("Marta");
    }
    //Inicializa el array de apellidos 
    private void inicializeSurname(){
        surname = new ArrayList<String>();
        surname.add("López");
        surname.add("González");
        surname.add("Martínez");
        surname.add("Rodríguez");
        surname.add("Pérez");
        surname.add("Fernández");
        surname.add("Sánchez");
        surname.add("Ramírez");
        surname.add("Torres");
        surname.add("Díaz");
        surname.add("Hernández");
        surname.add("Gómez");
        surname.add("Vargas");
        surname.add("Ruiz");
        surname.add("Jiménez");
        surname.add("Flores");
        surname.add("Silva");
        surname.add("Ortiz");
        surname.add("García");
        surname.add("Rojas");
        surname.add("Vázquez");
        surname.add("Mendoza");
        surname.add("Castillo");
        surname.add("Chávez");
        surname.add("Luna");
        surname.add("Navarro");
        surname.add("Guerrero");
        surname.add("Torres");
        surname.add("Vega");
        surname.add("Molina");
    }
    //Inicializa el array de paises
    private void inicializeCountries(){
        countries = new ArrayList<String>();
        countries.add("Estados Unidos");
        countries.add("Canadá");
        countries.add("México");
        countries.add("Brasil");
        countries.add("Argentina");
        countries.add("Reino Unido");
        countries.add("Francia");
        countries.add("Alemania");
        countries.add("España");
        countries.add("Italia");
        countries.add("China");
        countries.add("Japón");
        countries.add("India");
        countries.add("Australia");
        countries.add("Rusia");
        countries.add("Sudáfrica");
        countries.add("Egipto");
        countries.add("Nigeria");
        countries.add("Kenia");
        countries.add("Etiopía");
        countries.add("Canadá");
        countries.add("Colombia");
        countries.add("Chile");
        countries.add("Perú");
        countries.add("Ecuador");
        countries.add("Venezuela");
        countries.add("Costa Rica");
        countries.add("Panamá");
        countries.add("Cuba");
        countries.add("República Dominicana");
    }
    //Inicia ambas listas para generar nombres de heroes aleatorios
    private void addHeroName(){
        // Agregar 30 nombres de animales, objetos y lugares al ArrayList
        heroName.add("Tigre");
        heroName.add("Espada");
        heroName.add("Montaña");
        heroName.add("Elefante");
        heroName.add("Libro");
        heroName.add("Bosque");
        heroName.add("León");
        heroName.add("Barco");
        heroName.add("Playa");
        heroName.add("Águila");
        heroName.add("Reloj");
        heroName.add("Cueva");
        heroName.add("Zorro");
        heroName.add("Avión");
        heroName.add("Ciudad");
        heroName.add("Lobo");
        heroName.add("Escudo");
        heroName.add("Desierto");
        heroName.add("Ballena");
        heroName.add("Martillo");
        heroName.add("Volcán");
        heroName.add("Jirafa");
        heroName.add("Botella");
        heroName.add("Selva");
        heroName.add("Delfín");
        heroName.add("Silla");
        heroName.add("Pueblo");
        heroName.add("Puma");
        heroName.add("Espada");
        heroName.add("Lago");
        addHeroName2();
    }
    private void addHeroName2(){
        // Agregar 30 nombres de colores, piedras preciosas o dioses griegos al ArrayList
        heroName2.add("Rojo");
        heroName2.add("Zafiro");
        heroName2.add("Zeus");
        heroName2.add("Azul");
        heroName2.add("Esmeralda");
        heroName2.add("Apolo");
        heroName2.add("Verde");
        heroName2.add("Diamante");
        heroName2.add("Afrodita");
        heroName2.add("Amarillo");
        heroName2.add("Rubí");
        heroName2.add("Hermes");
        heroName2.add("Naranja");
        heroName2.add("Topacio");
        heroName2.add("Atenea");
        heroName2.add("Violeta");
        heroName2.add("Ópalo");
        heroName2.add("Hades");
        heroName2.add("Blanco");
        heroName2.add("Cuarzo");
        heroName2.add("Poseidón");
        heroName2.add("Negro");
        heroName2.add("Amatista");
        heroName2.add("Deméter");
        heroName2.add("Rosa");
        heroName2.add("Granate");
        heroName2.add("Afrodita");
        heroName2.add("Gris");
        heroName2.add("Turquesa");
        heroName2.add("Ares");
    }
    //Genera correos aleatorios
    private String getAddress(){
        String domains[] = {"gmail.com", "yahoo.com", "outlook.com", "hotmail.com", "example.com"};
        String name = "usuario" + (random.nextInt(1000) + 1);
        String domain = domains[random.nextInt(domains.length)];
        return (name+"@"+domain);
    }
}
