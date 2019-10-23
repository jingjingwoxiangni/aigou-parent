package cn.itsource.aigou.domain;

import lombok.Data;

/**
 * @author solargen
 * @version 1.0
 * @description TODO
 * @date 2019/10/23 14:14
 */
@Data
public class ProductParam {


    private String keyword;

    private Long productTypeId;

    private Long brandId;

    private Integer minPrice;

    private Integer maxPrice;

    private String sortField;

    private String sortType;

    private Integer page;

    private Integer rows;

}
