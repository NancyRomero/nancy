/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uniandes.nancy;

/**
 *
 * @author windows 8
 */
public class clsProducto {
    public enum unidad{litro,metro,libras};
    
    private int _id;
    private String _nombre;
    private float _valor;
    private unidad _unidad;

    public clsProducto() {
    }

    public clsProducto(int _id, String _nombre, float _valor, unidad _unidad) {
        this._id = _id;
        this._nombre = _nombre;
        this._valor = _valor;
        this._unidad = _unidad;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public float getValor() {
        return _valor;
    }

    public void setValor(float _valor) {
        this._valor = _valor;
    }

    public unidad getUnidad() {
        return _unidad;
    }

    public void setUnidad(unidad _unidad) {
        this._unidad = _unidad;
    }
    

}