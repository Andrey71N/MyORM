<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="db.dao.CategoriesMapper">
<resultMap id="BaseResultMap" type="db.model.Categories">
<!--
        WARNING - @mbg.generated
      This element is automatically generated by MyBatis Generator, do not modify.
              This element was generated on Sat Feb 26 20:51:31 SAMT 2022.
              -->
<id column="id" jdbcType="INTEGER" property="id" />
<result column="title" jdbcType="VARCHAR" property="title" />
</resultMap>
<sql id="Example_Where_Clause">
<!--
        WARNING - @mbg.generated
      This element is automatically generated by MyBatis Generator, do not modify.
              This element was generated on Sat Feb 26 20:51:31 SAMT 2022.
              -->
<where>
<foreach collection="oredCriteria" item="criteria" separator="or">
<if test="criteria.valid">
<trim prefix="(" prefixOverrides="and" suffix=")">
<foreach collection="criteria.criteria" item="criterion">
<choose>
<when test="criterion.noValue">
        and ${criterion.condition}
</when>
<when test="criterion.singleValue">
        and ${criterion.condition} #{criterion.value}
</when>
<when test="criterion.betweenValue">
        and ${criterion.condition} #{criterion.value} and #{criterion.secondValue}
</when>
<when test="criterion.listValue">
        and ${criterion.condition}
<foreach close=")" collection="criterion.value" item="listItem" open="(" separator=",">
        #{listItem}
        </foreach>
        </when>
        </choose>
        </foreach>
        </trim>
        </if>
        </foreach>
        </where>
        </sql>
        <sql id="Update_By_Example_Where_Clause">
        <!--
        WARNING - @mbg.generated
        This element is automatically generated by MyBatis Generator, do not modify.
        This element was generated on Sat Feb 26 20:51:31 SAMT 2022.
        -->
        <where>
        <foreach collection="example.oredCriteria" item="criteria" separator="or">
        <if test="criteria.valid">
        <trim prefix="(" prefixOverrides="and" suffix=")">
        <foreach collection="criteria.criteria" item="criterion">
        <choose>
        <when test="criterion.noValue">
        and ${criterion.condition}
        </when>
        <when test="criterion.singleValue">
        and ${criterion.condition} #{criterion.value}
        </when>
        <when test="criterion.betweenValue">
        and ${criterion.condition} #{criterion.value} and #{criterion.secondValue}
        </when>
        <when test="criterion.listValue">
        and ${criterion.condition}
        <foreach close=")" collection="criterion.value" item="listItem" open="(" separator=",">
        #{listItem}
        </foreach>
        </when>
        </choose>
        </foreach>
        </trim>
        </if>
        </foreach>
        </where>
        </sql>
        <sql id="Base_Column_List">
        <!--
        WARNING - @mbg.generated
        This element is automatically generated by MyBatis Generator, do not modify.
        This element was generated on Sat Feb 26 20:51:31 SAMT 2022.
        -->
        id, title
        </sql>
        <select id="selectByExample" parameterType="db.model.CategoriesExample" resultMap="BaseResultMap">
        <!--
        WARNING - @mbg.generated
        This element is automatically generated by MyBatis Generator, do not modify.
        This element was generated on Sat Feb 26 20:51:31 SAMT 2022.
        -->
        select
        <if test="distinct">
        distinct
        </if>
        <include refid="Base_Column_List" />
        from categories
        <if test="_parameter != null">
        <include refid="Example_Where_Clause" />
        </if>
        <if test="orderByClause != null">
        order by ${orderByClause}
        </if>
        </select>
        <select id="selectByPrimaryKey" parameterType="java.lang.Integer" resultMap="BaseResultMap">
        <!--
        WARNING - @mbg.generated
        This element is automatically generated by MyBatis Generator, do not modify.
        This element was generated on Sat Feb 26 20:51:31 SAMT 2022.
        -->
        select
        <include refid="Base_Column_List" />
        from categories
        where id = #{id,jdbcType=INTEGER}
        </select>
        <delete id="deleteByPrimaryKey" parameterType="java.lang.Integer">
        <!--
        WARNING - @mbg.generated
        This element is automatically generated by MyBatis Generator, do not modify.
        This element was generated on Sat Feb 26 20:51:31 SAMT 2022.
        -->
        delete from categories
        where id = #{id,jdbcType=INTEGER}
        </delete>
        <delete id="deleteByExample" parameterType="db.model.CategoriesExample">
        <!--
        WARNING - @mbg.generated
        This element is automatically generated by MyBatis Generator, do not modify.
        This element was generated on Sat Feb 26 20:51:31 SAMT 2022.
        -->
        delete from categories
        <if test="_parameter != null">
        <include refid="Example_Where_Clause" />
        </if>
        </delete>
        <insert id="insert" keyColumn="id" keyProperty="id" parameterType="db.model.Categories" useGeneratedKeys="true">
        <!--
        WARNING - @mbg.generated
        This element is automatically generated by MyBatis Generator, do not modify.
        This element was generated on Sat Feb 26 20:51:31 SAMT 2022.
        -->
        insert into categories (title)
        values (#{title,jdbcType=VARCHAR})
        </insert>
        <insert id="insertSelective" keyColumn="id" keyProperty="id" parameterType="db.model.Categories" useGeneratedKeys="true">
        <!--
        WARNING - @mbg.generated
        This element is automatically generated by MyBatis Generator, do not modify.
        This element was generated on Sat Feb 26 20:51:31 SAMT 2022.
        -->
        insert into categories
        <trim prefix="(" suffix=")" suffixOverrides=",">
        <if test="title != null">
        title,
        </if>
        </trim>
        <trim prefix="values (" suffix=")" suffixOverrides=",">
        <if test="title != null">
        #{title,jdbcType=VARCHAR},
        </if>
        </trim>
        </insert>
        <select id="countByExample" parameterType="db.model.CategoriesExample" resultType="java.lang.Long">
        <!--
        WARNING - @mbg.generated
        This element is automatically generated by MyBatis Generator, do not modify.
        This element was generated on Sat Feb 26 20:51:31 SAMT 2022.
        -->
        select count(*) from categories
        <if test="_parameter != null">
        <include refid="Example_Where_Clause" />
        </if>
        </select>
        <update id="updateByExampleSelective" parameterType="map">
        <!--
        WARNING - @mbg.generated
        This element is automatically generated by MyBatis Generator, do not modify.
        This element was generated on Sat Feb 26 20:51:31 SAMT 2022.
        -->
        update categories
        <set>
        <if test="record.id != null">
        id = #{record.id,jdbcType=INTEGER},
        </if>
        <if test="record.title != null">
        title = #{record.title,jdbcType=VARCHAR},
        </if>
        </set>
        <if test="_parameter != null">
        <include refid="Update_By_Example_Where_Clause" />
        </if>
        </update>
        <update id="updateByExample" parameterType="map">
        <!--
        WARNING - @mbg.generated
        This element is automatically generated by MyBatis Generator, do not modify.
        This element was generated on Sat Feb 26 20:51:31 SAMT 2022.
        -->
        update categories
        set id = #{record.id,jdbcType=INTEGER},
        title = #{record.title,jdbcType=VARCHAR}
        <if test="_parameter != null">
        <include refid="Update_By_Example_Where_Clause" />
        </if>
        </update>
        <update id="updateByPrimaryKeySelective" parameterType="db.model.Categories">
        <!--
        WARNING - @mbg.generated
        This element is automatically generated by MyBatis Generator, do not modify.
        This element was generated on Sat Feb 26 20:51:31 SAMT 2022.
        -->
        update categories
        <set>
        <if test="title != null">
        title = #{title,jdbcType=VARCHAR},
        </if>
        </set>
        where id = #{id,jdbcType=INTEGER}
        </update>
        <update id="updateByPrimaryKey" parameterType="db.model.Categories">
        <!--
        WARNING - @mbg.generated
        This element is automatically generated by MyBatis Generator, do not modify.
        This element was generated on Sat Feb 26 20:51:31 SAMT 2022.
        -->
        update categories
        set title = #{title,jdbcType=VARCHAR}
        where id = #{id,jdbcType=INTEGER}
        </update>
        </mapper>
