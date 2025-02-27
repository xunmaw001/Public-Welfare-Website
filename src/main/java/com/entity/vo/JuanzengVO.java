package com.entity.vo;

import com.entity.JuanzengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 物品捐赠
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("juanzeng")
public class JuanzengVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 物品名字
     */

    @TableField(value = "wupin_name")
    private String wupinName;


    /**
     * 物品类型
     */

    @TableField(value = "wupin_types")
    private Integer wupinTypes;


    /**
     * 物品数量
     */

    @TableField(value = "wupin_number")
    private Integer wupinNumber;


    /**
     * 取件地址
     */

    @TableField(value = "qujian_address")
    private String qujianAddress;


    /**
     * 捐赠详情
     */

    @TableField(value = "juanzeng_content")
    private String juanzengContent;


    /**
     * 是否接收
     */

    @TableField(value = "juanzeng_types")
    private Integer juanzengTypes;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：物品名字
	 */
    public String getWupinName() {
        return wupinName;
    }


    /**
	 * 获取：物品名字
	 */

    public void setWupinName(String wupinName) {
        this.wupinName = wupinName;
    }
    /**
	 * 设置：物品类型
	 */
    public Integer getWupinTypes() {
        return wupinTypes;
    }


    /**
	 * 获取：物品类型
	 */

    public void setWupinTypes(Integer wupinTypes) {
        this.wupinTypes = wupinTypes;
    }
    /**
	 * 设置：物品数量
	 */
    public Integer getWupinNumber() {
        return wupinNumber;
    }


    /**
	 * 获取：物品数量
	 */

    public void setWupinNumber(Integer wupinNumber) {
        this.wupinNumber = wupinNumber;
    }
    /**
	 * 设置：取件地址
	 */
    public String getQujianAddress() {
        return qujianAddress;
    }


    /**
	 * 获取：取件地址
	 */

    public void setQujianAddress(String qujianAddress) {
        this.qujianAddress = qujianAddress;
    }
    /**
	 * 设置：捐赠详情
	 */
    public String getJuanzengContent() {
        return juanzengContent;
    }


    /**
	 * 获取：捐赠详情
	 */

    public void setJuanzengContent(String juanzengContent) {
        this.juanzengContent = juanzengContent;
    }
    /**
	 * 设置：是否接收
	 */
    public Integer getJuanzengTypes() {
        return juanzengTypes;
    }


    /**
	 * 获取：是否接收
	 */

    public void setJuanzengTypes(Integer juanzengTypes) {
        this.juanzengTypes = juanzengTypes;
    }
    /**
	 * 设置：预约时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：预约时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
