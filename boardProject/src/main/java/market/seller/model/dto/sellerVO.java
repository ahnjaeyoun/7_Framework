package market.seller.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class sellerVO {

	private int sellerId;
	private String sellerName;
	private String sellerHomepageUrl;
	
}
