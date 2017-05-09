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
 * <pre>QApiStructDescriptor{name=BlockDeviceInfo, data={file=str, *node-name=str, ro=bool, drv=str, *backing_file=str, backing_file_depth=int, encrypted=bool, encryption_key_missing=bool, detect_zeroes=BlockdevDetectZeroesOptions, bps=int, bps_rd=int, bps_wr=int, iops=int, iops_rd=int, iops_wr=int, image=ImageInfo, *bps_max=int, *bps_rd_max=int, *bps_wr_max=int, *iops_max=int, *iops_rd_max=int, *iops_wr_max=int, *bps_max_length=int, *bps_rd_max_length=int, *bps_wr_max_length=int, *iops_max_length=int, *iops_rd_max_length=int, *iops_wr_max_length=int, *iops_size=int, *group=str, cache=BlockdevCacheInfo, write_threshold=int}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=BlockDeviceInfo, data={file=str, *node-name=str, ro=bool, drv=str, *backing_file=str, backing_file_depth=int, encrypted=bool, encryption_key_missing=bool, detect_zeroes=BlockdevDetectZeroesOptions, bps=int, bps_rd=int, bps_wr=int, iops=int, iops_rd=int, iops_wr=int, image=ImageInfo, *bps_max=int, *bps_rd_max=int, *bps_wr_max=int, *iops_max=int, *iops_rd_max=int, *iops_wr_max=int, *bps_max_length=int, *bps_rd_max_length=int, *bps_wr_max_length=int, *iops_max_length=int, *iops_rd_max_length=int, *iops_wr_max_length=int, *iops_size=int, *group=str, cache=BlockdevCacheInfo, write_threshold=int}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockDeviceInfo extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("file")
	@Nonnull
	public java.lang.String file;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("node-name")
	@CheckForNull
	public java.lang.String nodeName;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("ro")
	@Nonnull
	public boolean ro;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("drv")
	@Nonnull
	public java.lang.String drv;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("backing_file")
	@CheckForNull
	public java.lang.String backingFile;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("backing_file_depth")
	@Nonnull
	public long backingFileDepth;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("encrypted")
	@Nonnull
	public boolean encrypted;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("encryption_key_missing")
	@Nonnull
	public boolean encryptionKeyMissing;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("detect_zeroes")
	@Nonnull
	public BlockdevDetectZeroesOptions detectZeroes;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("bps")
	@Nonnull
	public long bps;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("bps_rd")
	@Nonnull
	public long bpsRd;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("bps_wr")
	@Nonnull
	public long bpsWr;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("iops")
	@Nonnull
	public long iops;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("iops_rd")
	@Nonnull
	public long iopsRd;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("iops_wr")
	@Nonnull
	public long iopsWr;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("image")
	@Nonnull
	public ImageInfo image;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("bps_max")
	@CheckForNull
	public java.lang.Long bpsMax;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("bps_rd_max")
	@CheckForNull
	public java.lang.Long bpsRdMax;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("bps_wr_max")
	@CheckForNull
	public java.lang.Long bpsWrMax;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("iops_max")
	@CheckForNull
	public java.lang.Long iopsMax;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("iops_rd_max")
	@CheckForNull
	public java.lang.Long iopsRdMax;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("iops_wr_max")
	@CheckForNull
	public java.lang.Long iopsWrMax;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("bps_max_length")
	@CheckForNull
	public java.lang.Long bpsMaxLength;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("bps_rd_max_length")
	@CheckForNull
	public java.lang.Long bpsRdMaxLength;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("bps_wr_max_length")
	@CheckForNull
	public java.lang.Long bpsWrMaxLength;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("iops_max_length")
	@CheckForNull
	public java.lang.Long iopsMaxLength;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("iops_rd_max_length")
	@CheckForNull
	public java.lang.Long iopsRdMaxLength;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("iops_wr_max_length")
	@CheckForNull
	public java.lang.Long iopsWrMaxLength;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("iops_size")
	@CheckForNull
	public java.lang.Long iopsSize;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("group")
	@CheckForNull
	public java.lang.String group;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("cache")
	@Nonnull
	public BlockdevCacheInfo cache;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("write_threshold")
	@Nonnull
	public long writeThreshold;

	@Nonnull
	public BlockDeviceInfo withFile(java.lang.String value) {
		this.file = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withNodeName(java.lang.String value) {
		this.nodeName = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withRo(boolean value) {
		this.ro = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withDrv(java.lang.String value) {
		this.drv = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withBackingFile(java.lang.String value) {
		this.backingFile = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withBackingFileDepth(long value) {
		this.backingFileDepth = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withEncrypted(boolean value) {
		this.encrypted = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withEncryptionKeyMissing(boolean value) {
		this.encryptionKeyMissing = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withDetectZeroes(BlockdevDetectZeroesOptions value) {
		this.detectZeroes = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withBps(long value) {
		this.bps = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withBpsRd(long value) {
		this.bpsRd = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withBpsWr(long value) {
		this.bpsWr = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withIops(long value) {
		this.iops = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withIopsRd(long value) {
		this.iopsRd = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withIopsWr(long value) {
		this.iopsWr = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withImage(ImageInfo value) {
		this.image = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withBpsMax(java.lang.Long value) {
		this.bpsMax = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withBpsRdMax(java.lang.Long value) {
		this.bpsRdMax = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withBpsWrMax(java.lang.Long value) {
		this.bpsWrMax = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withIopsMax(java.lang.Long value) {
		this.iopsMax = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withIopsRdMax(java.lang.Long value) {
		this.iopsRdMax = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withIopsWrMax(java.lang.Long value) {
		this.iopsWrMax = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withBpsMaxLength(java.lang.Long value) {
		this.bpsMaxLength = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withBpsRdMaxLength(java.lang.Long value) {
		this.bpsRdMaxLength = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withBpsWrMaxLength(java.lang.Long value) {
		this.bpsWrMaxLength = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withIopsMaxLength(java.lang.Long value) {
		this.iopsMaxLength = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withIopsRdMaxLength(java.lang.Long value) {
		this.iopsRdMaxLength = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withIopsWrMaxLength(java.lang.Long value) {
		this.iopsWrMaxLength = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withIopsSize(java.lang.Long value) {
		this.iopsSize = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withGroup(java.lang.String value) {
		this.group = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withCache(BlockdevCacheInfo value) {
		this.cache = value;
		return this;
	}

	@Nonnull
	public BlockDeviceInfo withWriteThreshold(long value) {
		this.writeThreshold = value;
		return this;
	}

	public BlockDeviceInfo() {
	}

	public BlockDeviceInfo(java.lang.String file, java.lang.String nodeName, boolean ro, java.lang.String drv, java.lang.String backingFile, long backingFileDepth, boolean encrypted, boolean encryptionKeyMissing, BlockdevDetectZeroesOptions detectZeroes, long bps, long bpsRd, long bpsWr, long iops, long iopsRd, long iopsWr, ImageInfo image, java.lang.Long bpsMax, java.lang.Long bpsRdMax, java.lang.Long bpsWrMax, java.lang.Long iopsMax, java.lang.Long iopsRdMax, java.lang.Long iopsWrMax, java.lang.Long bpsMaxLength, java.lang.Long bpsRdMaxLength, java.lang.Long bpsWrMaxLength, java.lang.Long iopsMaxLength, java.lang.Long iopsRdMaxLength, java.lang.Long iopsWrMaxLength, java.lang.Long iopsSize, java.lang.String group, BlockdevCacheInfo cache, long writeThreshold) {
		this.file = file;
		this.nodeName = nodeName;
		this.ro = ro;
		this.drv = drv;
		this.backingFile = backingFile;
		this.backingFileDepth = backingFileDepth;
		this.encrypted = encrypted;
		this.encryptionKeyMissing = encryptionKeyMissing;
		this.detectZeroes = detectZeroes;
		this.bps = bps;
		this.bpsRd = bpsRd;
		this.bpsWr = bpsWr;
		this.iops = iops;
		this.iopsRd = iopsRd;
		this.iopsWr = iopsWr;
		this.image = image;
		this.bpsMax = bpsMax;
		this.bpsRdMax = bpsRdMax;
		this.bpsWrMax = bpsWrMax;
		this.iopsMax = iopsMax;
		this.iopsRdMax = iopsRdMax;
		this.iopsWrMax = iopsWrMax;
		this.bpsMaxLength = bpsMaxLength;
		this.bpsRdMaxLength = bpsRdMaxLength;
		this.bpsWrMaxLength = bpsWrMaxLength;
		this.iopsMaxLength = iopsMaxLength;
		this.iopsRdMaxLength = iopsRdMaxLength;
		this.iopsWrMaxLength = iopsWrMaxLength;
		this.iopsSize = iopsSize;
		this.group = group;
		this.cache = cache;
		this.writeThreshold = writeThreshold;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("file");
		names.add("node-name");
		names.add("ro");
		names.add("drv");
		names.add("backing_file");
		names.add("backing_file_depth");
		names.add("encrypted");
		names.add("encryption_key_missing");
		names.add("detect_zeroes");
		names.add("bps");
		names.add("bps_rd");
		names.add("bps_wr");
		names.add("iops");
		names.add("iops_rd");
		names.add("iops_wr");
		names.add("image");
		names.add("bps_max");
		names.add("bps_rd_max");
		names.add("bps_wr_max");
		names.add("iops_max");
		names.add("iops_rd_max");
		names.add("iops_wr_max");
		names.add("bps_max_length");
		names.add("bps_rd_max_length");
		names.add("bps_wr_max_length");
		names.add("iops_max_length");
		names.add("iops_rd_max_length");
		names.add("iops_wr_max_length");
		names.add("iops_size");
		names.add("group");
		names.add("cache");
		names.add("write_threshold");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("file".equals(name))
			return file;
		if ("node-name".equals(name))
			return nodeName;
		if ("ro".equals(name))
			return ro;
		if ("drv".equals(name))
			return drv;
		if ("backing_file".equals(name))
			return backingFile;
		if ("backing_file_depth".equals(name))
			return backingFileDepth;
		if ("encrypted".equals(name))
			return encrypted;
		if ("encryption_key_missing".equals(name))
			return encryptionKeyMissing;
		if ("detect_zeroes".equals(name))
			return detectZeroes;
		if ("bps".equals(name))
			return bps;
		if ("bps_rd".equals(name))
			return bpsRd;
		if ("bps_wr".equals(name))
			return bpsWr;
		if ("iops".equals(name))
			return iops;
		if ("iops_rd".equals(name))
			return iopsRd;
		if ("iops_wr".equals(name))
			return iopsWr;
		if ("image".equals(name))
			return image;
		if ("bps_max".equals(name))
			return bpsMax;
		if ("bps_rd_max".equals(name))
			return bpsRdMax;
		if ("bps_wr_max".equals(name))
			return bpsWrMax;
		if ("iops_max".equals(name))
			return iopsMax;
		if ("iops_rd_max".equals(name))
			return iopsRdMax;
		if ("iops_wr_max".equals(name))
			return iopsWrMax;
		if ("bps_max_length".equals(name))
			return bpsMaxLength;
		if ("bps_rd_max_length".equals(name))
			return bpsRdMaxLength;
		if ("bps_wr_max_length".equals(name))
			return bpsWrMaxLength;
		if ("iops_max_length".equals(name))
			return iopsMaxLength;
		if ("iops_rd_max_length".equals(name))
			return iopsRdMaxLength;
		if ("iops_wr_max_length".equals(name))
			return iopsWrMaxLength;
		if ("iops_size".equals(name))
			return iopsSize;
		if ("group".equals(name))
			return group;
		if ("cache".equals(name))
			return cache;
		if ("write_threshold".equals(name))
			return writeThreshold;
		return super.getFieldByName(name);
	}
}
