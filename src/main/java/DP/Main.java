package DP;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        nombre nombre = new nombre("John", "Doe", "");
        edad edad = new edad("29", "");
        person john = new person(nombre, edad);
        System.out.println(john);
        cambiaredad(john, "30");
        System.out.println(john);

    }

    public static void cambiaredad(person person, String edad) {
        person.getEdad().setEdad(edad);
    }
}

class nombre {
    private String name;
    private String lastname;
    private String middlename;

    public nombre(String name, String lastname, String middlename) {
        this.name = name;
        this.lastname = lastname;
        this.middlename = middlename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    @Override
    public String toString() {
        return "nombre{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", middlename='" + middlename + '\'' +
                '}';
    }
}

class edad {
    private String edad;
    private String fecha_de_nacimiento;

    public edad(String edad, String fecha_de_nacimiento) {
        this.edad = edad;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    @Override
    public String toString() {
        return "edad{" +
                "edad='" + edad + '\'' +
                ", fecha_de_nacimiento='" + fecha_de_nacimiento + '\'' +
                '}';
    }

}

class person {
    nombre name;
    edad edad;

    public person(nombre name, edad edad) {
        this.edad = edad;
        this.name = name;
    }


    @Override
    public String toString() {
        return "person{" +
                "name=" + name +
                ", edad=" + edad +
                '}';
    }

    public nombre getName() {
        return name;
    }

    public void setName(nombre name) {
        this.name = name;
    }

    public DP.edad getEdad() {
        return edad;
    }

    public void setEdad(DP.edad edad) {
        this.edad = edad;
    }
}

class chino extends person {
    String pais;

    public chino(nombre name, DP.edad edad) {
        super(name, edad);
    }
}

class holandes extends person {
    String comida_favorita;

    public holandes(nombre name, DP.edad edad) {
        super(name, edad);
    }
}
