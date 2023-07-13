package br.com.andersonchoren.car_location.dto;

import br.com.andersonchoren.car_location.model.LocationModel;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClientDTO {
    private UUID id;
    @NotBlank
    private String name;
    @NotBlank
    private String phone;
    @NotBlank
    @Email
    private String email;
    @NotNull
    private LocalDate birthday;
    private List<LocationModel> locations;
}
