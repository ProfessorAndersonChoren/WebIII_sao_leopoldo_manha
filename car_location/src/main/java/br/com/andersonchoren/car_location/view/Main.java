package br.com.andersonchoren.car_location.view;

import br.com.andersonchoren.car_location.model.VehicleModel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        VehicleModel vehicle = new VehicleModel();
        VehicleModel vehicle2 = new VehicleModel();

//        System.out.println(vehicle.hashCode());
//        System.out.println(vehicle2.hashCode());
//        System.out.println(vehicle.equals(vehicle2));

        // Entrada
        System.out.println("Digite a placa do veículo");
        vehicle.plate = teclado.next();
        System.out.println("Digite o modelo do veículo");
        vehicle.model = teclado.nextLine();
        System.out.println("Digite a marca do veículo");
        vehicle.brand = teclado.nextLine();

        // Saída
        System.out.printf("Modelo: %s\nMarca: %s\nPlaca: %s",vehicle.model,vehicle.brand,vehicle.plate);
    }
}
