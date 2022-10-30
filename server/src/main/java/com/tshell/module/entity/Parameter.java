package com.tshell.module.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *  参数
 *
 *  tar -c -f result.tar f1.txt f2.txt
 *
 *  f1.txt f2.txt则为参数
 *
 *  参数
 *
 * @author TheBlind
 * @date 2022/6/30
 */
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Parameter  extends PanacheEntityBase {


    @Id
    @GeneratedValue
    public int id;

    private int cmdId;

    /**
     *  参数下标
     */
    @Column(name = "`index`")
    private int index;

    /**
     * 描述
     */
    private String description;

}
