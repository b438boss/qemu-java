package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiStructDescriptor{name=BlockdevOptionsCurlHttp, data={*cookie=str, *cookie-secret=str}, innerTypes=null, fields=null, base=BlockdevOptionsCurlBase}</pre>
 */
// QApiStructDescriptor{name=BlockdevOptionsCurlHttp, data={*cookie=str, *cookie-secret=str}, innerTypes=null, fields=null, base=BlockdevOptionsCurlBase}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockdevOptionsCurlHttp extends BlockdevOptionsCurlBase {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("cookie")
	@CheckForNull
	public java.lang.String cookie;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("cookie-secret")
	@CheckForNull
	public java.lang.String cookieSecret;

	@Nonnull
	public BlockdevOptionsCurlHttp withCookie(java.lang.String value) {
		this.cookie = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsCurlHttp withCookieSecret(java.lang.String value) {
		this.cookieSecret = value;
		return this;
	}

	public BlockdevOptionsCurlHttp() {
	}

	public BlockdevOptionsCurlHttp(java.lang.String cookie, java.lang.String cookieSecret) {
		this.cookie = cookie;
		this.cookieSecret = cookieSecret;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("cookie");
		names.add("cookie-secret");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("cookie".equals(name))
			return cookie;
		if ("cookie-secret".equals(name))
			return cookieSecret;
		return super.getFieldByName(name);
	}
}
