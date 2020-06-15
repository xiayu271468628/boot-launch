package com.zimuge.bootlaunch.model.yml;

import lombok.Data;
import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

/**
 * @author ：xy
 * @date ：Created in 2020/6/9 14:42
 * @description：
 * @modified By：
 * @version: $
 */
@Data
@Component
@Validated//注入的属性进行校验，只有加上才会触发数据校验
@ConfigurationProperties(prefix = "family")
public class Family {
    /**
     * @Value获取配置值
     * @Value("${family.family-name}")
    */
    @NotEmpty//数据校验，必须不为空
    private String familyName;
    private Father father;
    private Mother mother;
    private Child child;

    /**
     * 数据校验的其他示例
     * @size (min = 6, max = 20, message = " 密码长度只能在6 - 20之间 ")
     * @pattern (regexp = " [a - za - z0 - 9._ % + - ] + @ [a - za - z0 - 9. - ] + \ .[a - za - z] { 2, 4 } ", message = " 请输入正确的邮件格式 ")
     * @Length(min = 5, max = 20, message = "用户名长度必须位于5到20之间")
     * @Email(message = "请输入正确的邮箱")
     * @NotNull(message = "用户名称不能为空")
     * @Max(value = 100, message = "年龄不能大于100岁")
     * @Min(value= 18 ,message= "必须年满18岁！" )
     * @AssertTrue(message = "bln4 must is true")
     * @AssertFalse(message = "blnf must is falase")
     * @DecimalMax(value="100",message="decim最大值是100")
     * @DecimalMin(value="100",message="decim最小值是100")
     * @NotNull(message = "身份证不能为空")
     * @Pattern(regexp="^(\d{18,18}|\d{15,15}|(\d{17,17}[x|X]))$", message="身份证格式错误")
     */
}