package co.com.restapiexample.models;

import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;

import static co.com.restapiexample.utilities.Enums.VariablesFeature.*;

public class ModeloCrearEmpleado {
    private final String name;
    private final String salary;
    private final String age;

    public ModeloCrearEmpleado(String name, String salary, String age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

    public String getAge() {
        return age;
    }

    public String body() {
        Map<String, String> map = new HashMap<>();
        map.put(NOMBRE.getValor(), getName());
        map.put(SALARIO.getValor(), getSalary());
        map.put(EDAD.getValor(), getAge());
        JSONObject bodyConsultarAgenda = new JSONObject(map);
        return bodyConsultarAgenda.toJSONString();
    }
}