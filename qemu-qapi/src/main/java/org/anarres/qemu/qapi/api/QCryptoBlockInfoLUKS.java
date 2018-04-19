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
 * <pre>QApiStructDescriptor{name=QCryptoBlockInfoLUKS, data={cipher-alg=QCryptoCipherAlgorithm, cipher-mode=QCryptoCipherMode, ivgen-alg=QCryptoIVGenAlgorithm, *ivgen-hash-alg=QCryptoHashAlgorithm, hash-alg=QCryptoHashAlgorithm, payload-offset=int, master-key-iters=int, uuid=str, slots=[QCryptoBlockInfoLUKSSlot]}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=QCryptoBlockInfoLUKS, data={cipher-alg=QCryptoCipherAlgorithm, cipher-mode=QCryptoCipherMode, ivgen-alg=QCryptoIVGenAlgorithm, *ivgen-hash-alg=QCryptoHashAlgorithm, hash-alg=QCryptoHashAlgorithm, payload-offset=int, master-key-iters=int, uuid=str, slots=[QCryptoBlockInfoLUKSSlot]}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class QCryptoBlockInfoLUKS extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("cipher-alg")
	@Nonnull
	public QCryptoCipherAlgorithm cipherAlg;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("cipher-mode")
	@Nonnull
	public QCryptoCipherMode cipherMode;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("ivgen-alg")
	@Nonnull
	public QCryptoIVGenAlgorithm ivgenAlg;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("ivgen-hash-alg")
	@CheckForNull
	public QCryptoHashAlgorithm ivgenHashAlg;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("hash-alg")
	@Nonnull
	public QCryptoHashAlgorithm hashAlg;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("payload-offset")
	@Nonnull
	public long payloadOffset;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("master-key-iters")
	@Nonnull
	public long masterKeyIters;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("uuid")
	@Nonnull
	public java.lang.String uuid;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("slots")
	@Nonnull
	public java.util.List<QCryptoBlockInfoLUKSSlot> slots;

	@Nonnull
	public QCryptoBlockInfoLUKS withCipherAlg(QCryptoCipherAlgorithm value) {
		this.cipherAlg = value;
		return this;
	}

	@Nonnull
	public QCryptoBlockInfoLUKS withCipherMode(QCryptoCipherMode value) {
		this.cipherMode = value;
		return this;
	}

	@Nonnull
	public QCryptoBlockInfoLUKS withIvgenAlg(QCryptoIVGenAlgorithm value) {
		this.ivgenAlg = value;
		return this;
	}

	@Nonnull
	public QCryptoBlockInfoLUKS withIvgenHashAlg(QCryptoHashAlgorithm value) {
		this.ivgenHashAlg = value;
		return this;
	}

	@Nonnull
	public QCryptoBlockInfoLUKS withHashAlg(QCryptoHashAlgorithm value) {
		this.hashAlg = value;
		return this;
	}

	@Nonnull
	public QCryptoBlockInfoLUKS withPayloadOffset(long value) {
		this.payloadOffset = value;
		return this;
	}

	@Nonnull
	public QCryptoBlockInfoLUKS withMasterKeyIters(long value) {
		this.masterKeyIters = value;
		return this;
	}

	@Nonnull
	public QCryptoBlockInfoLUKS withUuid(java.lang.String value) {
		this.uuid = value;
		return this;
	}

	@Nonnull
	public QCryptoBlockInfoLUKS withSlots(java.util.List<QCryptoBlockInfoLUKSSlot> value) {
		this.slots = value;
		return this;
	}

	public QCryptoBlockInfoLUKS() {
	}

	public QCryptoBlockInfoLUKS(QCryptoCipherAlgorithm cipherAlg, QCryptoCipherMode cipherMode, QCryptoIVGenAlgorithm ivgenAlg, QCryptoHashAlgorithm ivgenHashAlg, QCryptoHashAlgorithm hashAlg, long payloadOffset, long masterKeyIters, java.lang.String uuid, java.util.List<QCryptoBlockInfoLUKSSlot> slots) {
		this.cipherAlg = cipherAlg;
		this.cipherMode = cipherMode;
		this.ivgenAlg = ivgenAlg;
		this.ivgenHashAlg = ivgenHashAlg;
		this.hashAlg = hashAlg;
		this.payloadOffset = payloadOffset;
		this.masterKeyIters = masterKeyIters;
		this.uuid = uuid;
		this.slots = slots;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("cipher-alg");
		names.add("cipher-mode");
		names.add("ivgen-alg");
		names.add("ivgen-hash-alg");
		names.add("hash-alg");
		names.add("payload-offset");
		names.add("master-key-iters");
		names.add("uuid");
		names.add("slots");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("cipher-alg".equals(name))
			return cipherAlg;
		if ("cipher-mode".equals(name))
			return cipherMode;
		if ("ivgen-alg".equals(name))
			return ivgenAlg;
		if ("ivgen-hash-alg".equals(name))
			return ivgenHashAlg;
		if ("hash-alg".equals(name))
			return hashAlg;
		if ("payload-offset".equals(name))
			return payloadOffset;
		if ("master-key-iters".equals(name))
			return masterKeyIters;
		if ("uuid".equals(name))
			return uuid;
		if ("slots".equals(name))
			return slots;
		return super.getFieldByName(name);
	}
}
