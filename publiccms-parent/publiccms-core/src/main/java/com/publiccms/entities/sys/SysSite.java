package com.publiccms.entities.sys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.publiccms.common.database.CmsUpgrader;
import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * SysSite generated by hbm2java
 */
@Entity
@Table(name = "sys_site")
@DynamicUpdate
public class SysSite implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private Short id;
    @GeneratorColumn(title = "父站点", condition = true)
    private Short parentId;
    @GeneratorColumn(title = "名称", condition = true, like = true)
    private String name;
    @GeneratorColumn(title = "启用静态化")
    private boolean useStatic;
    @GeneratorColumn(title = "站点地址")
    private String sitePath;
    @GeneratorColumn(title = "启用SSI")
    private boolean useSsi;
    @GeneratorColumn(title = "动态站点地址")
    private String dynamicPath;
    @GeneratorColumn(title = "禁用", condition = true)
    @JsonIgnore
    private boolean disabled;

    public SysSite() {
    }

    public SysSite(String name, boolean useStatic, String sitePath, boolean useSsi, String dynamicPath, boolean disabled) {
        this.name = name;
        this.useStatic = useStatic;
        this.sitePath = sitePath;
        this.useSsi = useSsi;
        this.dynamicPath = dynamicPath;
        this.disabled = disabled;
    }

    public SysSite(Short parentId, String name, boolean useStatic, String sitePath, boolean useSsi, String dynamicPath,
            boolean disabled) {
        this.parentId = parentId;
        this.name = name;
        this.useStatic = useStatic;
        this.sitePath = sitePath;
        this.useSsi = useSsi;
        this.dynamicPath = dynamicPath;
        this.disabled = disabled;
    }

    @Id
    @GeneratedValue(generator = "cmsGenerator")
    @GenericGenerator(name = "cmsGenerator", strategy = CmsUpgrader.IDENTIFIER_GENERATOR)
    @Column(name = "id", unique = true, nullable = false)
    public Short getId() {
        return this.id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    @Column(name = "parent_id")
    public Short getParentId() {
        return this.parentId;
    }

    public void setParentId(Short parentId) {
        this.parentId = parentId;
    }

    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "use_static", nullable = false)
    public boolean isUseStatic() {
        return this.useStatic;
    }

    public void setUseStatic(boolean useStatic) {
        this.useStatic = useStatic;
    }

    @Column(name = "site_path", nullable = false)
    public String getSitePath() {
        return this.sitePath;
    }

    public void setSitePath(String sitePath) {
        this.sitePath = sitePath;
    }

    @Column(name = "use_ssi", nullable = false)
    public boolean isUseSsi() {
        return this.useSsi;
    }

    public void setUseSsi(boolean useSsi) {
        this.useSsi = useSsi;
    }

    @Column(name = "dynamic_path", nullable = false)
    public String getDynamicPath() {
        return this.dynamicPath;
    }

    public void setDynamicPath(String dynamicPath) {
        this.dynamicPath = dynamicPath;
    }

    @Column(name = "disabled", nullable = false)
    public boolean isDisabled() {
        return this.disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

}
