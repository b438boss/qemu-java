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
 * <pre>QApiStructDescriptor{name=ImageInfo, data={filename=str, format=str, *dirty-flag=bool, *actual-size=int, virtual-size=int, *cluster-size=int, *encrypted=bool, *compressed=bool, *backing-filename=str, *full-backing-filename=str, *backing-filename-format=str, *snapshots=[SnapshotInfo], *backing-image=ImageInfo, *format-specific=ImageInfoSpecific}, innerTypes=null, fields=null, base=null}</pre>
 */
// QApiStructDescriptor{name=ImageInfo, data={filename=str, format=str, *dirty-flag=bool, *actual-size=int, virtual-size=int, *cluster-size=int, *encrypted=bool, *compressed=bool, *backing-filename=str, *full-backing-filename=str, *backing-filename-format=str, *snapshots=[SnapshotInfo], *backing-image=ImageInfo, *format-specific=ImageInfoSpecific}, innerTypes=null, fields=null, base=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ImageInfo extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("filename")
	@Nonnull
	public java.lang.String filename;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("format")
	@Nonnull
	public java.lang.String format;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("dirty-flag")
	@CheckForNull
	public java.lang.Boolean dirtyFlag;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("actual-size")
	@CheckForNull
	public java.lang.Long actualSize;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("virtual-size")
	@Nonnull
	public long virtualSize;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("cluster-size")
	@CheckForNull
	public java.lang.Long clusterSize;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("encrypted")
	@CheckForNull
	public java.lang.Boolean encrypted;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("compressed")
	@CheckForNull
	public java.lang.Boolean compressed;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("backing-filename")
	@CheckForNull
	public java.lang.String backingFilename;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("full-backing-filename")
	@CheckForNull
	public java.lang.String fullBackingFilename;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("backing-filename-format")
	@CheckForNull
	public java.lang.String backingFilenameFormat;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("snapshots")
	@CheckForNull
	public java.util.List<SnapshotInfo> snapshots;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("backing-image")
	@CheckForNull
	public ImageInfo backingImage;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("format-specific")
	@CheckForNull
	public ImageInfoSpecific formatSpecific;

	@Nonnull
	public ImageInfo withFilename(java.lang.String value) {
		this.filename = value;
		return this;
	}

	@Nonnull
	public ImageInfo withFormat(java.lang.String value) {
		this.format = value;
		return this;
	}

	@Nonnull
	public ImageInfo withDirtyFlag(java.lang.Boolean value) {
		this.dirtyFlag = value;
		return this;
	}

	@Nonnull
	public ImageInfo withActualSize(java.lang.Long value) {
		this.actualSize = value;
		return this;
	}

	@Nonnull
	public ImageInfo withVirtualSize(long value) {
		this.virtualSize = value;
		return this;
	}

	@Nonnull
	public ImageInfo withClusterSize(java.lang.Long value) {
		this.clusterSize = value;
		return this;
	}

	@Nonnull
	public ImageInfo withEncrypted(java.lang.Boolean value) {
		this.encrypted = value;
		return this;
	}

	@Nonnull
	public ImageInfo withCompressed(java.lang.Boolean value) {
		this.compressed = value;
		return this;
	}

	@Nonnull
	public ImageInfo withBackingFilename(java.lang.String value) {
		this.backingFilename = value;
		return this;
	}

	@Nonnull
	public ImageInfo withFullBackingFilename(java.lang.String value) {
		this.fullBackingFilename = value;
		return this;
	}

	@Nonnull
	public ImageInfo withBackingFilenameFormat(java.lang.String value) {
		this.backingFilenameFormat = value;
		return this;
	}

	@Nonnull
	public ImageInfo withSnapshots(java.util.List<SnapshotInfo> value) {
		this.snapshots = value;
		return this;
	}

	@Nonnull
	public ImageInfo withBackingImage(ImageInfo value) {
		this.backingImage = value;
		return this;
	}

	@Nonnull
	public ImageInfo withFormatSpecific(ImageInfoSpecific value) {
		this.formatSpecific = value;
		return this;
	}

	public ImageInfo() {
	}

	public ImageInfo(java.lang.String filename, java.lang.String format, java.lang.Boolean dirtyFlag, java.lang.Long actualSize, long virtualSize, java.lang.Long clusterSize, java.lang.Boolean encrypted, java.lang.Boolean compressed, java.lang.String backingFilename, java.lang.String fullBackingFilename, java.lang.String backingFilenameFormat, java.util.List<SnapshotInfo> snapshots, ImageInfo backingImage, ImageInfoSpecific formatSpecific) {
		this.filename = filename;
		this.format = format;
		this.dirtyFlag = dirtyFlag;
		this.actualSize = actualSize;
		this.virtualSize = virtualSize;
		this.clusterSize = clusterSize;
		this.encrypted = encrypted;
		this.compressed = compressed;
		this.backingFilename = backingFilename;
		this.fullBackingFilename = fullBackingFilename;
		this.backingFilenameFormat = backingFilenameFormat;
		this.snapshots = snapshots;
		this.backingImage = backingImage;
		this.formatSpecific = formatSpecific;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("filename");
		names.add("format");
		names.add("dirty-flag");
		names.add("actual-size");
		names.add("virtual-size");
		names.add("cluster-size");
		names.add("encrypted");
		names.add("compressed");
		names.add("backing-filename");
		names.add("full-backing-filename");
		names.add("backing-filename-format");
		names.add("snapshots");
		names.add("backing-image");
		names.add("format-specific");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("filename".equals(name))
			return filename;
		if ("format".equals(name))
			return format;
		if ("dirty-flag".equals(name))
			return dirtyFlag;
		if ("actual-size".equals(name))
			return actualSize;
		if ("virtual-size".equals(name))
			return virtualSize;
		if ("cluster-size".equals(name))
			return clusterSize;
		if ("encrypted".equals(name))
			return encrypted;
		if ("compressed".equals(name))
			return compressed;
		if ("backing-filename".equals(name))
			return backingFilename;
		if ("full-backing-filename".equals(name))
			return fullBackingFilename;
		if ("backing-filename-format".equals(name))
			return backingFilenameFormat;
		if ("snapshots".equals(name))
			return snapshots;
		if ("backing-image".equals(name))
			return backingImage;
		if ("format-specific".equals(name))
			return formatSpecific;
		return super.getFieldByName(name);
	}
}
