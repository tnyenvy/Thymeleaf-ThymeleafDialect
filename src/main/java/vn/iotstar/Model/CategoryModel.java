package vn.iotstar.Model;

import java.io.Serializable;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryModel implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private Long Id;
	@NotEmpty(message="Không bỏ trống!")
	private String name;
	private String images;
	private int status;
	private Boolean isEdit=false;

}