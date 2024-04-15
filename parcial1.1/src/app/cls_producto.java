/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class cls_producto {
    private int var_codigoint;
    private String var_nombrestr;
    private String var_nombretrabajadorstr;
    private int var_existenciasint;

    public cls_producto(int codigo, String nombreMaterial, String nombreTrabajador, int existencias) {
        this.var_codigoint = codigo;
        this.var_nombrestr = nombreMaterial;
        this.var_nombretrabajadorstr = nombreTrabajador;
        this.var_existenciasint = existencias;
    }

    public int get_codigoint() {
        return this.var_codigoint;
    }

    public String get_nombrestr() {
        return this.var_nombrestr;
    }

    public String get_nombretrabajadorstr() {
        return this.var_nombretrabajadorstr;
    }

    public int get_existenciasint() {
        return this.var_existenciasint;
    }


    public void set_codigo(int codigo) {
        this.var_codigoint = codigo;
    }

    public void set_nombre_material(String nombreMaterial) {
        this.var_nombrestr = nombreMaterial;
    }

    public void set_nombre_trabajador(String nombreTrabajador) {
        this.var_nombretrabajadorstr = nombreTrabajador;
    }

    public void set_existencias(int existencias) {
        this.var_existenciasint = existencias;
    }

    public boolean validarProducto() {
        // Expresión regular para validar el código (números positivos)
        String regexCodigo = "^[1-9]\\d*$";
        // Expresión regular para validar el nombre del material (cualquier caracter alfanumérico)
        String regexNombreMaterial = "^[a-zA-Z0-9 ]+$";
        // Expresión regular para validar el nombre del trabajador (cualquier caracter alfanumérico)
        String regexNombreTrabajador = "^[a-zA-Z0-9 ]+$";
        // Expresión regular para validar las existencias (números positivos)
        String regexExistencias = "^[1-9]\\d*$";

        // Patrones de las expresiones regulares
        Pattern patternCodigo = Pattern.compile(regexCodigo);
        Pattern patternNombreMaterial = Pattern.compile(regexNombreMaterial);
        Pattern patternNombreTrabajador = Pattern.compile(regexNombreTrabajador);
        Pattern patternExistencias = Pattern.compile(regexExistencias);

        // Validación de cada campo con su respectiva expresión regular
        Matcher matcherCodigo = patternCodigo.matcher(String.valueOf(this.var_codigoint));
        Matcher matcherNombreMaterial = patternNombreMaterial.matcher(this.var_nombrestr);
        Matcher matcherNombreTrabajador = patternNombreTrabajador.matcher(this.var_nombretrabajadorstr);
        Matcher matcherExistencias = patternExistencias.matcher(String.valueOf(this.var_existenciasint));

        // Verificar si todas las validaciones son exitosas
        return matcherCodigo.matches() && matcherNombreMaterial.matches() && matcherNombreTrabajador.matches()
                && matcherExistencias.matches();
    }
}
