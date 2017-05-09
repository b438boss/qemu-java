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
 * <pre>QApiStructDescriptor{name=QCryptoBlockInfoBase, data={format=QCryptoBlockFormat}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=QCryptoBlockInfoBase, data={format=QCryptoBlockFormat}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class QCryptoBlockInfoBase extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("format")
	@Nonnull
	public QCryptoBlockFormat format;

	@Nonnull
	public QCryptoBlockInfoBase withFormat(QCryptoBlockFormat value) {
		this.format = value;
		return this;
	}

	public QCryptoBlockInfoBase() {
	}

	public QCryptoBlockInfoBase(QCryptoBlockFormat format) {
		this.format = format;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("format");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("format".equals(name))
			return format;
		return super.getFieldByName(name);
	}
}
