package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiUnionDescriptor{name=BlockdevQcow2Encryption, discriminator=format, data={aes=QCryptoBlockOptionsQCow, luks=QCryptoBlockOptionsLUKS}, innerTypes=null, fields=null, base={format=BlockdevQcow2EncryptionFormat}, discriminatorField=null}</pre>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockdevQcow2Encryption extends BlockdevQcow2EncryptionBase implements QApiUnion {

	// union {
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("aes")
	@JsonUnwrapped
	@CheckForNull
	public QCryptoBlockOptionsQCow aes;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("luks")
	@JsonUnwrapped
	@CheckForNull
	public QCryptoBlockOptionsLUKS luks;
	// }

	@Nonnull
	public static BlockdevQcow2Encryption aes(@Nonnull QCryptoBlockOptionsQCow aes) {
		BlockdevQcow2Encryption self = new BlockdevQcow2Encryption();
		self.format = BlockdevQcow2EncryptionFormat.aes;
		self.aes = aes;
		return self;
	}

	@Nonnull
	public static BlockdevQcow2Encryption luks(@Nonnull QCryptoBlockOptionsLUKS luks) {
		BlockdevQcow2Encryption self = new BlockdevQcow2Encryption();
		self.format = BlockdevQcow2EncryptionFormat.luks;
		self.luks = luks;
		return self;
	}

	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("aes");
		names.add("luks");
		return names;
	}

	@JsonIgnore
	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("aes".equals(name))
			return aes;
		if ("luks".equals(name))
			return luks;
		return super.getFieldByName(name);
	}

	@JsonIgnore
	public boolean isValidUnion() {
		int count = 0;
		if (aes != null)
			count++;
		if (luks != null)
			count++;
		return (count == 1);
	}
}
