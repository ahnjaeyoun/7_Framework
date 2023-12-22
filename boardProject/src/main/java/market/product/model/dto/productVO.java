package market.product.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class productVO {

	private int productNum;
	private String productName;
	private int productPrice;
	private String productRegistDate;
	private int totalSellCount;
}
