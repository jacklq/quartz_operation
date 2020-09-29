package com.zxq.model.query;

import com.zxq.model.vo.PageVO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zxq
 * @date 2020/3/25 16:10
 **/
@Data
public class UserQuery extends PageVO {

    /**
     * 用户名
     */
    private String username;

}
