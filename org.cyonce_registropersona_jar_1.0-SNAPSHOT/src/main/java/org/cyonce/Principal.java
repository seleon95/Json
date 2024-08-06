package org.cyonce;

import org.json.JSONArray;
import org.json.JSONObject;

public class Principal {

    public static void main(String[] args) {

        JSONObject persona1 = new JSONObject();
        persona1.put("Estado Civil", "Casado");
        persona1.put("Nombre", "Juan");
        persona1.put("Edad", 45);
        persona1.put("Apellido Paterno", "Robles");
        persona1.put("Apellido Materno", "Perez");
        persona1.put("Genero", "Masculino");

        JSONObject domicilio1 = new JSONObject();
        domicilio1.put("Calle", "Sedros");
        domicilio1.put("Numero Interior", 2);
        domicilio1.put("Numero Exterior", 1);
        domicilio1.put("Codigo Postal", 95876);
        domicilio1.put("Estado", "Veracruz");
        domicilio1.put("Colonia", "Madero");
        persona1.put("Domicilio", domicilio1);

        JSONArray telefonos = new JSONArray();

        JSONObject telefono1 = new JSONObject();
        telefono1.put("TipoTelefono", "Laboral");
        telefono1.put("Lada", 012);
        telefono1.put("Telefono", 689754119);
        telefonos.put(telefono1);

        JSONObject telefono2 = new JSONObject();
        telefono2.put("TipoTelefono", "Personal");
        telefono2.put("Lada", 013);
        telefono2.put("Telefono", 584789652);
        telefonos.put(telefono2);
        persona1.put("Telefonos", telefonos);

        JSONArray correos = new JSONArray();

        JSONObject correo1 = new JSONObject();
        correo1.put("TipoCorreo", "Personal");
        correo1.put("Email", "persona1@gmail.com");
        correos.put(correo1);

        JSONObject correo2 = new JSONObject();
        correo2.put("TipoCorreo", "Empresarial");
        correo2.put("Email", "empresarial@gmail.com");
        correos.put(correo2);
        persona1.put("Correos", correos);

        JSONObject empleo1 = new JSONObject();
        empleo1.put("Empresa", "Pemex");
        empleo1.put("Puesto", "Gerente");
        empleo1.put("Antiguedad", "10 Años");
        persona1.put("Empleo", empleo1);

        /////////////////////////////////////////////////////////////////////////////
        JSONObject persona2 = new JSONObject();
        persona2.put("Estado Civil", "Soltera");
        persona2.put("Nombre", "Roberta");
        persona2.put("Edad", 25);
        persona2.put("Apellido Paterno", "Huerta");
        persona2.put("Apellido Materno", "Linares");
        persona2.put("Genero", "Femenino");

        JSONArray domicilios2 = new JSONArray();

        JSONObject domicilio2 = new JSONObject();
        domicilio2.put("Calle", "Aventura");
        domicilio2.put("Numero Interior", 4);
        domicilio2.put("Numero Exterior", 1);
        domicilio2.put("Codigo Postal", 90879);
        domicilio2.put("Estado", "Tlaxcala");
        domicilio2.put("Colonia", "Centro");
        domicilios2.put(domicilio2);

        JSONObject domicilio2a = new JSONObject();
        domicilio2a.put("Calle", "Ribas");
        domicilio2a.put("Numero Interior", 1);
        domicilio2a.put("Numero Exterior", 7);
        domicilio2a.put("Codigo Postal", 905896);
        domicilio2a.put("Estado", "Puebla");
        domicilio2a.put("Colonia", "Centro");
        domicilios2.put(domicilio2a);
        persona2.put("Domicilios", domicilios2);

        JSONArray telefonos2 = new JSONArray();

        JSONObject telefono2a = new JSONObject();
        telefono2a.put("TipoTelefono", "Personal");
        telefono2a.put("Lada", 015);
        telefono2a.put("Telefono", 896589652);
        telefonos2.put(telefono2a);

        JSONObject telefono2b = new JSONObject();
        telefono2b.put("TipoTelefono", "Laboral");
        telefono2b.put("Lada", 027);
        telefono2b.put("Telefono", 789569652);
        telefonos2.put(telefono2b);
        persona2.put("Telefonos", telefonos2);

        JSONArray correosA = new JSONArray();

        JSONObject correo2a = new JSONObject();
        correo2a.put("TipoCorreo", "Personal");
        correo2a.put("Email", "persona1@gmail.com");
        correosA.put(correo2a);

        JSONObject correo2b = new JSONObject();
        correo2b.put("TipoCorreo", "Empresarial");
        correo2b.put("Email", "empresarial@gmail.com");
        correosA.put(correo2b);
        persona2.put("Correos", correosA);

        JSONObject empleo2 = new JSONObject();
        empleo2.put("Empresa", "Picolina");
        empleo2.put("Puesto", "Gerente");
        empleo2.put("Antiguedad", "5 Años");
        persona2.put("Empleo", empleo2);

        JSONArray personas = new JSONArray();
        personas.put(persona1);
        personas.put(persona2);

        System.out.println(personas.toString(4));
    }
}
