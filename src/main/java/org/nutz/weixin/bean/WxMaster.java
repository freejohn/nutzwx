package org.nutz.weixin.bean;

import org.nutz.dao.entity.annotation.Name;

/**
 * 描述一个微信公众号的信息
 * @author wendal(wendal1985@gmail.com)
 *
 */
public class WxMaster {

	/**
	 * 该公众帐号的openid, 一般以gh_开头,作为数据库主键
	 */
	@Name
	private String openid;
	/**
	 * 别名,当作配置的key使用
	 */
	private String alias;
	/**
	 * 昵称,显示用
	 */
	private String nickname;
	/**
	 * 核心参数,必须有,应用的token值
	 */
	private String token;
	/**
	 * 关键参数,服务号才有
	 */
	private String appid;
	/**
	 * 关键参数,服务号才有
	 */
	private String appsecret;
	/**
	 * 访问微信API所必须,但有效期短,变化的值
	 */
	private String access_token;
	/**
	 * 记录access_token失效的时间
	 */
	private long access_token_expires;
	
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getAppsecret() {
		return appsecret;
	}
	public void setAppsecret(String appsecret) {
		this.appsecret = appsecret;
	}
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public long getAccess_token_expires() {
		return access_token_expires;
	}
	public void setAccess_token_expires(long access_token_expires) {
		this.access_token_expires = access_token_expires;
	}
	
	public String toString() {
		return openid + "@wx";
	}
	
	@Override
	public int hashCode() {
		return toString().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return toString().equals(String.valueOf(obj));
	}
}
