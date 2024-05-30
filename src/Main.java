import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, CuerpoCeleste> sistemaSolar = new HashMap<>();

    private static Set<CuerpoCeleste> planetas = new HashSet<>();

    public static void main(String[] args) {
        // Creamos el planeta Mercurio
        CuerpoCeleste mercurio = new CuerpoCeleste("Mercurio", 88, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Mercurio", mercurio);
        planetas.add(mercurio);

        // Creamos el planeta Venus
        CuerpoCeleste venus = new CuerpoCeleste("Venus", 225, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Venus", venus);
        planetas.add(venus);

        // Creamos el planeta La Tierra
        CuerpoCeleste tierra = new CuerpoCeleste("Tierra", 365, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Tierra", tierra);
        planetas.add(tierra);

        // Creamos el planeta Marte
        CuerpoCeleste marte = new CuerpoCeleste("Marte", 687, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Marte", marte);
        planetas.add(marte);

        // Creamos el planeta Jupiter
        CuerpoCeleste jupiter = new CuerpoCeleste("Jupiter", 4332, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Jupiter", jupiter);
        planetas.add(jupiter);

        // Creamos el planeta Saturno
        CuerpoCeleste saturno = new CuerpoCeleste("Saturno", 10759, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Saturno", saturno);
        planetas.add(saturno);

        // Creamos el planeta Urano
        CuerpoCeleste urano = new CuerpoCeleste("Urano", 30660, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Urano", urano);
        planetas.add(urano);

        // Creamos el planeta Neptuno
        CuerpoCeleste neptuno = new CuerpoCeleste("Neptuno", 165, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Neptuno", neptuno);
        planetas.add(neptuno);

        // Creamos el planeta Pluton
        CuerpoCeleste pluton = new CuerpoCeleste("Pluton", 248, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Pluton", pluton);
        planetas.add(pluton);

        // Creamos la Luna satélite de la Tierra
        CuerpoCeleste luna = new CuerpoCeleste("Luna", 27, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Luna", luna);
        tierra.addSatelites(luna);

        //Satélites de Marte
        // Creamos Deimos satélite de Marte
        CuerpoCeleste deimos = new CuerpoCeleste("Deimos", 1.3, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Deimos", deimos);
        marte.addSatelites(deimos);

        // Creamos la Phobos satélite de Marte
        CuerpoCeleste phobos = new CuerpoCeleste("Phobos", 0.3, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Phobos", phobos);
        marte.addSatelites(phobos);

        //Satélites de Júpiter
        // Creamos Io satélite de Júpiter
        CuerpoCeleste io = new CuerpoCeleste("Io", 1.8, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Io", io);
        jupiter.addSatelites(io);

        // Creamos Europa satélite de Júpiter
        CuerpoCeleste europa = new CuerpoCeleste("Europa", 3.5, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Europa", europa);
        jupiter.addSatelites(europa);

        // Creamos Ganymede satélite de Júpiter
        CuerpoCeleste ganymede = new CuerpoCeleste("Ganymede", 7.1, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Ganymede", ganymede);
        jupiter.addSatelites(ganymede);

        // Creamos Callisto satélite de Júpiter
        CuerpoCeleste callisto = new CuerpoCeleste("Callisto", 16.7, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Callisto", callisto);
        jupiter.addSatelites(callisto);

        //Mostramos todos los planetas del sistema solar
        System.out.println("\n[+] Los planetas del sistema solar son: ");
        for(CuerpoCeleste planetas : planetas){
            System.out.println("\t" + planetas);
        }

        //Mostramos las lunas de Marte
        Set<CuerpoCeleste> Marte = sistemaSolar.get("Marte").getSatelites();
        System.out.println("\n[+] Las lunas de Marte son: ");
        for(CuerpoCeleste satelite: Marte){
            System.out.println("\t" + satelite);
        }


        // Creamos el set en el que añadiremos los sets de satelites de los planetas
        System.out.println("\n[+] Las lunas totales del sistema solar son: ");
        Set<CuerpoCeleste> lunas = new HashSet<>();
        for(CuerpoCeleste planeta : planetas){
            lunas.addAll(planeta.getSatelites());
        }
        //Lo leemos
        for(CuerpoCeleste lunita : lunas){
            System.out.println("\t" + lunita);
        }

        //Creamos el planeta Pluton 884
        CuerpoCeleste pluton2 = new CuerpoCeleste("Pluton", 884, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Pluton", pluton2);
        planetas.add(pluton2);

        //Volvemos a mostrar los planetas
        //Mostramos todos los planetas del sistema solar
        System.out.println("\n[+] Los planetas del sistema solar son: ");
        for(CuerpoCeleste planetas : planetas){
            System.out.println("\t" + planetas);
        }

        //Creamos el planeta Pluton 884
        CuerpoCeleste plutonEnano = new CuerpoCeleste("Pluton", 884, CuerpoCeleste.TipoCuerpoCeleste.PLANETA_ENANO);
        sistemaSolar.put("Pluton", plutonEnano);
        planetas.add(plutonEnano);

        //Volvemos a mostrar los planetas para comprobar si se añade como planeta enano
        //Mostramos todos los planetas del sistema solar
        System.out.println("\n[+] Los planetas del sistema solar son: ");
        for(CuerpoCeleste planetas : planetas){
            System.out.println("\t" + planetas);
        }


        // Creo dos conjuntos para almacenar las lunas de Jupiter y las de Marte
        Set<CuerpoCeleste> lunasJupiter = (sistemaSolar.get("Jupiter")).getSatelites();
        Set<CuerpoCeleste> lunasMarte = (sistemaSolar.get("Marte")).getSatelites();

        // Crear copias de los sets para usar en operaciones sin modificar los originales
        Set<CuerpoCeleste> interseccion = new HashSet<>(lunasJupiter);
        Set<CuerpoCeleste> diferenciaJupiter = new HashSet<>(lunasJupiter);
        Set<CuerpoCeleste> diferenciaMarte = new HashSet<>(lunasMarte);

        // Intersección: Modifica el primer conjunto para retener solo los elementos que están en ambos conjuntos
        interseccion.retainAll(lunasMarte);

        // Diferencia: Modifica el primer conjunto para remover todos los elementos que están en el segundo conjunto
        diferenciaJupiter.removeAll(lunasMarte);
        diferenciaMarte.removeAll(lunasJupiter);

        // Imprimir resultados
        System.out.println("\nLunas en Júpiter y Marte (Intersección): " + interseccion);
        System.out.println("Lunas únicas en Júpiter (Diferencia): " + diferenciaJupiter);
        System.out.println("Lunas únicas en Marte (Diferencia): " + diferenciaMarte);

    }
}