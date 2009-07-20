/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.37
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.xuggle.xuggler;
import com.xuggle.ferry.*;
/**
 * The work horse of the Xuggler: Takes {@link IPacket} data from an 
 * {@link IContainer}  
 * (representing an {@link IStream}) and an {@link ICodec} and allows 
 * you to decode or encode  
 * that data.  
 */
public class IStreamCoder extends RefCounted implements com.xuggle.xuggler.IConfigurable {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    IBuffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected IStreamCoder(long cPtr, boolean cMemoryOwn) {
    super(XugglerJNI.SWIGIStreamCoderUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected IStreamCoder(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(XugglerJNI.SWIGIStreamCoderUpcast(cPtr),
     cMemoryOwn, ref);
    swigCPtr = cPtr;
  }
    
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  public static long getCPtr(IStreamCoder obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  public long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new IStreamCoder object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public IStreamCoder copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new IStreamCoder(swigCPtr, swigCMemOwn, getJavaRefCount());
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof IStreamCoder)
      equal = (((IStreamCoder)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  

  /**
   * Returns the fourcc tag, in order of least significant byte
   * to most significant byte.
   *
   * @return a 4 char array of the fourcc
   */
  
  public char[] getCodecTagArray()
  {
    char[] retval = new char[4];
    int fourcc = this.getCodecTag();
    
    retval[0] = (char)(fourcc & 0xFF);
    retval[1] = (char)((fourcc >> 8) & 0xFF);
    retval[2] = (char)((fourcc >> 16) & 0xFF);
    retval[3] = (char)((fourcc >> 24) & 0xFF);
    return retval;
  }
  /**
   * Set the fourcc tag.
   *
   * @param fourcc A four char array, in order of least significant byte
   *  to most significant byte.
   *
   * @throws IllegalArgumentException if the array passed in is not exactly 4 bytes.
   */
   
   public void setCodecTag(char[] fourcc)
   {
     if (fourcc == null || fourcc.length != 4)
      throw new IllegalArgumentException();
     int tag = 0;
     tag = (fourcc[3]<<24)+(fourcc[2]<<16)+(fourcc[1]<<8)+fourcc[0];
     this.setCodecTag(tag);
   }
   
   /**
    * Prints  details on this IStreamCoder
    *
    * @return key details for this IStreamCoder
    */
    
  @Override
  public String toString()
  {
    StringBuilder result = new StringBuilder();
    ICodec.Type type = getCodecType();
    
    result.append(this.getClass().getName()+"@"+hashCode()+"[");
    result.append("codec="+getCodec()+";");
    result.append("time base="+getTimeBase()+";");
    result.append("frame rate="+getFrameRate()+";");
    switch(type)
    {
      case CODEC_TYPE_VIDEO:
        result.append("pixel type="+getPixelType()+";");
        result.append("width="+getWidth()+";");
        result.append("height="+getHeight()+";");
        break;
      case CODEC_TYPE_AUDIO:
        result.append("sample rate="+getSampleRate()+";");
        result.append("channels="+getChannels()+";");
        break;
      default:
        break;
    }
    result.append("]");
    return result.toString();
  }
  
  /**
   * {@inheritDoc}
   */
  public java.util.Collection<String> getPropertyNames()
  {
    java.util.Collection<String> retval = new java.util.LinkedList<String>();
    int numProperties = this.getNumProperties();
    for(int i = 0; i < numProperties; i++)
    {
      IProperty property = this.getPropertyMetaData(i);
      String name = property.getName();
      retval.add(name);
    }
    return retval;
  }

  

/**
 * Get the direction.  
 * @return	The direction this StreamCoder works in.  
 */
  public IStreamCoder.Direction getDirection() {
    return IStreamCoder.Direction.swigToEnum(XugglerJNI.IStreamCoder_getDirection(swigCPtr, this));
  }

/**
 * The associated Stream we're working on.  
 * @return	The stream associated with this object.  
 */
  public IStream getStream() {
    long cPtr = XugglerJNI.IStreamCoder_getStream(swigCPtr, this);
    return (cPtr == 0) ? null : new IStream(cPtr, false);
  }

/**
 * The Codec this StreamCoder will use.  
 * @return	The Codec used by this StreamCoder, or 0 (null) if none. 
 *		  
 */
  public ICodec getCodec() {
    long cPtr = XugglerJNI.IStreamCoder_getCodec(swigCPtr, this);
    return (cPtr == 0) ? null : new ICodec(cPtr, false);
  }

/**
 * A short hand for getCodec().getType().  
 * <p>  
 * <b>  
 * Note for Native (C++) users:  
 * </b>  
 * </p>  
 * If you actually write code like the above  
 * from Native code, you'd leak  
 * a Codec() since you didn't call release() on it.  
 * This method is a short hand way to avoid you having to  
 * worry about releasing in between.  
 * @return	The Type of the Codec we'll use.  
 */
  public ICodec.Type getCodecType() {
    return ICodec.Type.swigToEnum(XugglerJNI.IStreamCoder_getCodecType(swigCPtr, this));
  }

/**
 * A short hand for getCodec().getID().  
 * <p>  
 * <b>  
 * Note for Native (C++) users:  
 * </b>  
 * </p>  
 * If you actually write code like the above  
 * from Native code, you'd leak  
 * a Codec() since you didn't call release() on it.  
 * This method is a short hand way to avoid you having to  
 * worry about releasing in between.  
 * @return	The ID of the Codec we'll use.  
 */
  public ICodec.ID getCodecID() {
    return ICodec.ID.swigToEnum(XugglerJNI.IStreamCoder_getCodecID(swigCPtr, this));
  }

/**
 * Set the Codec to the passed in Codec, discarding the old  
 * Codec if set.  
 * <p>  
 * Once you call setCodec, all settings on the IStreamCoder are  
 * reset to default values. So you probably want to call this  
 * first.  
 * </p>  
 * @param	codec Codec to set.  
 */
  public void setCodec(ICodec codec) {
    XugglerJNI.IStreamCoder_setCodec__SWIG_0(swigCPtr, this, ICodec.getCPtr(codec), codec);
  }

/**
 * Look up a Codec based on the passed in ID, and then set it.  
 * To see if you actually set the correct ID, call getCodec() and  
 * check for 0 (null).  
 * <p>  
 * Once you call setCodec, all settings on the IStreamCoder are  
 * reset to default values. So you probably want to call this  
 * first.  
 * </p>  
 * @param	id ID of codec to set.  
 */
  public void setCodec(ICodec.ID id) {
    XugglerJNI.IStreamCoder_setCodec__SWIG_1(swigCPtr, this, id.swigValue());
  }

/**
 * The bit rate.  
 * @return	The bit-rate the stream is, or will be, encoded in.  
 */
  public int getBitRate() {
    return XugglerJNI.IStreamCoder_getBitRate(swigCPtr, this);
  }

/**
 * When ENCODING, sets the bit rate to use. No-op when DECODING.  
 * @see		#getBitRate()  
 * @param	rate The bit rate to use.  
 */
  public void setBitRate(int rate) {
    XugglerJNI.IStreamCoder_setBitRate(swigCPtr, this, rate);
  }

/**
 * The bit rate tolerance  
 * @return	The bit-rate tolerance  
 */
  public int getBitRateTolerance() {
    return XugglerJNI.IStreamCoder_getBitRateTolerance(swigCPtr, this);
  }

/**
 * When ENCODING set the bit rate tolerance. No-op when DECODING.  
 * @param	tolerance The bit rate tolerance  
 */
  public void setBitRateTolerance(int tolerance) {
    XugglerJNI.IStreamCoder_setBitRateTolerance(swigCPtr, this, tolerance);
  }

/**
 * The height, in pixels.  
 * @return	The height of the video frames in the attached stream  
 * or -1 if an audio stream, or we cannot determine the height.  
 */
  public int getHeight() {
    return XugglerJNI.IStreamCoder_getHeight(swigCPtr, this);
  }

/**
 * Set the height, in pixels.  
 * @see		#getHeight()  
 * @param	height Sets the height of video frames we'll encode. No-op 
 *		 when DECODING.  
 */
  public void setHeight(int height) {
    XugglerJNI.IStreamCoder_setHeight(swigCPtr, this, height);
  }

/**
 * The width, in pixels.  
 * @return	The width of the video frames in the attached stream  
 * or -1 if an audio stream, or we cannot determine the width.  
 */
  public int getWidth() {
    return XugglerJNI.IStreamCoder_getWidth(swigCPtr, this);
  }

/**
 * Set the width, in pixels  
 * @see		#getWidth()  
 * @param	width Sets the width of video frames we'll encode. No-op when 
 *		 DECODING.  
 */
  public void setWidth(int width) {
    XugglerJNI.IStreamCoder_setWidth(swigCPtr, this, width);
  }

/**
 * Get the time base this stream will ENCODE in, or the time base we 
 *  
 * detect while DECODING.  
 * Caller must call release() on the returned value.  
 * @return	The time base this StreamCoder is using.  
 */
  public IRational getTimeBase() {
    long cPtr = XugglerJNI.IStreamCoder_getTimeBase(swigCPtr, this);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

/**
 * Set the time base we'll use to ENCODE with. A no-op when DECODING. 
 *  
 * As a convenience, we forward this call to the Stream#setTimeBase() 
 *  
 * method.  
 * @see		#getTimeBase()  
 * @param	newTimeBase The new time base to use.  
 */
  public void setTimeBase(IRational newTimeBase) {
    XugglerJNI.IStreamCoder_setTimeBase(swigCPtr, this, IRational.getCPtr(newTimeBase), newTimeBase);
  }

/**
 * Get the frame-rate the attached stream claims to be using when  
 * DECODING, or the frame-rate we'll claim we're using when ENCODING. 
 *  
 * @return	The frame rate.  
 */
  public IRational getFrameRate() {
    long cPtr = XugglerJNI.IStreamCoder_getFrameRate(swigCPtr, this);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

/**
 * Set the frame rate we'll set in the headers of this stream while 
 *  
 *  
 * but the TimeBase and the PTS you set on the encoded audio  
 * and video frames can override this.  
 * As a convenience, we forward this call to the Stream::setFrameRate() 
 *  
 * method.  
 * @see		#getFrameRate()  
 * @param	newFrameRate The new frame rate to use.  
 */
  public void setFrameRate(IRational newFrameRate) {
    XugglerJNI.IStreamCoder_setFrameRate(swigCPtr, this, IRational.getCPtr(newFrameRate), newFrameRate);
  }

/**
 * The the number of pictures in this Group of Pictures (GOP). See the 
 *  
 * MPEG specs for what a GOP is officially, but this is the minimum 
 *  
 * number of frames between key-frames (or Intra-Frames in MPEG speak). 
 *  
 * @return	the GOPS for this stream.  
 */
  public int getNumPicturesInGroupOfPictures() {
    return XugglerJNI.IStreamCoder_getNumPicturesInGroupOfPictures(swigCPtr, this);
  }

/**
 * Set the GOPS on this stream. Ignored if DECODING.  
 * @see		#getNumPicturesInGroupOfPictures()  
 * @param	gops The new GOPS for the stream we're encoding.  
 */
  public void setNumPicturesInGroupOfPictures(int gops) {
    XugglerJNI.IStreamCoder_setNumPicturesInGroupOfPictures(swigCPtr, this, gops);
  }

/**
 * For Video streams, get the Pixel Format in use by the stream.  
 * @return	the Pixel format, or IPixelFormat::NONE if audio.  
 */
  public IPixelFormat.Type getPixelType() {
    return IPixelFormat.Type.swigToEnum(XugglerJNI.IStreamCoder_getPixelType(swigCPtr, this));
  }

/**
 * Set the pixel format to ENCODE with. Ignored if audio or  
 * DECODING.  
 * @param	pixelFmt Pixel format to use.  
 */
  public void setPixelType(IPixelFormat.Type pixelFmt) {
    XugglerJNI.IStreamCoder_setPixelType(swigCPtr, this, pixelFmt.swigValue());
  }

/**
 * Get the sample rate we use for this stream.  
 * @return	The sample rate (in Hz) we use for this stream, or -1 if 
 *		 unknown or video.  
 */
  public int getSampleRate() {
    return XugglerJNI.IStreamCoder_getSampleRate(swigCPtr, this);
  }

/**
 * Set the sample rate to use when ENCODING. Ignored if DECODING  
 * or a non-audio stream.  
 * @param	sampleRate New sample rate (in Hz) to use.  
 */
  public void setSampleRate(int sampleRate) {
    XugglerJNI.IStreamCoder_setSampleRate(swigCPtr, this, sampleRate);
  }

/**
 * Get the audio sample format.  
 * @return	The sample format of samples for encoding/decoding.  
 */
  public IAudioSamples.Format getSampleFormat() {
    return IAudioSamples.Format.swigToEnum(XugglerJNI.IStreamCoder_getSampleFormat(swigCPtr, this));
  }

/**
 * Set the sample format when ENCODING. Ignored if DECODING  
 * or if the coder is already open.  
 * @param	aFormat The sample format.  
 */
  public void setSampleFormat(IAudioSamples.Format aFormat) {
    XugglerJNI.IStreamCoder_setSampleFormat(swigCPtr, this, aFormat.swigValue());
  }

/**
 * Get the number of channels in this audio stream  
 * @return	The sample rate (in Hz) we use for this stream, or 0 if unknown. 
 *		  
 */
  public int getChannels() {
    return XugglerJNI.IStreamCoder_getChannels(swigCPtr, this);
  }

/**
 * Set the number of channels to use when ENCODING. Ignored if a  
 * non audio stream, or if DECODING.  
 * @param	channels The number of channels we'll encode with.  
 */
  public void setChannels(int channels) {
    XugglerJNI.IStreamCoder_setChannels(swigCPtr, this, channels);
  }

/**
 * For this stream, get the number of audio samples that are  
 * represented in a packet of information.  
 * @return	Number of samples per 'frame' of encoded audio  
 */
  public int getAudioFrameSize() {
    return XugglerJNI.IStreamCoder_getAudioFrameSize(swigCPtr, this);
  }

/**
 * Get the Global Quality setting this codec uses for video if  
 * a VideoPicture doesn't have a quality set.  
 * @return	The global quality.  
 */
  public int getGlobalQuality() {
    return XugglerJNI.IStreamCoder_getGlobalQuality(swigCPtr, this);
  }

/**
 * Set the Global Quality to a new value.  
 * @param	newQuality The new global quality.  
 */
  public void setGlobalQuality(int newQuality) {
    XugglerJNI.IStreamCoder_setGlobalQuality(swigCPtr, this, newQuality);
  }

/**
 * Get the flags associated with this codec.  
 * @return	The (compacted) value of all flags set.  
 */
  public int getFlags() {
    return XugglerJNI.IStreamCoder_getFlags(swigCPtr, this);
  }

/**
 * Set the FFMPEG flags to use with this codec. All values  
 * must be ORed (|) together.  
 * @see		Flags  
 * @param	newFlags The new set flags for this codec.  
 */
  public void setFlags(int newFlags) {
    XugglerJNI.IStreamCoder_setFlags(swigCPtr, this, newFlags);
  }

/**
 * Get the setting for the specified flag  
 * @param	flag The flag you want to find the setting for  
 * @return	0 for false; non-zero for true  
 */
  public boolean getFlag(IStreamCoder.Flags flag) {
    return XugglerJNI.IStreamCoder_getFlag(swigCPtr, this, flag.swigValue());
  }

/**
 * Set the flag.  
 * @param	flag The flag to set  
 * @param	value The value to set it to (true or false)  
 */
  public void setFlag(IStreamCoder.Flags flag, boolean value) {
    XugglerJNI.IStreamCoder_setFlag(swigCPtr, this, flag.swigValue(), value);
  }

/**
 * For this stream, get the next Pts that we expect to decode.  
 * Note that this may not actually be the next Pts (for example  
 * due to transmission packet drops in the input source). Still  
 * it can be a useful tool.  
 * @return	The next presentation time stamp we expect to decode  
 * on this stream. This is always in units of 1/1,000,000 seconds  
 */
  public long getNextPredictedPts() {
    return XugglerJNI.IStreamCoder_getNextPredictedPts(swigCPtr, this);
  }

/**
 * Open the Codec associated with this StreamCoder.  
 * You can get the codec through getCodec(...) and  
 * set it with setCodec(...). You cannot call any  
 * set* methods after you've called open() on this StreamCoder  
 * until you close() it.  
 * You must call close() when you're done, but if you don't,  
 * the container will clean up after you (but yell at you)  
 * when it is closed.  
 * @return	>= 0 on success; < 0 on error.  
 */
  public int open() {
    return XugglerJNI.IStreamCoder_open(swigCPtr, this);
  }

/**
 * Close a Codec that was opened on this StreamCoder.  
 * @return	>= 0 on success; < 0 on error.  
 */
  public int close() {
    return XugglerJNI.IStreamCoder_close(swigCPtr, this);
  }

/**
 * Decode this packet into pOutSamples. It will  
 * try to fill up the audio samples object, starting  
 * from the byteOffset inside this packet.  
 * The caller is responsible for allocating the  
 * IAudioSamples object. This function will overwrite  
 * any data in the samples object.  
 * @param	pOutSamples The AudioSamples we decode.  
 * @param	packet The packet we're attempting to decode from.  
 *  
 * @return	number of bytes actually processed from the packet, or negative 
 *		 for error  
 */
  public int decodeAudio(IAudioSamples pOutSamples, IPacket packet, int byteOffset) {
    return XugglerJNI.IStreamCoder_decodeAudio(swigCPtr, this, IAudioSamples.getCPtr(pOutSamples), pOutSamples, IPacket.getCPtr(packet), packet, byteOffset);
  }

/**
 * Decode this packet into pOutFrame.  
 * The caller is responsible for allocating the  
 * IVideoPicture object. This function will potentially  
 * overwrite any data in the frame object, but  
 * you should pass the same IVideoPicture into this function  
 * repeatedly until IVideoPicture::isComplete() is true.  
 * @param	pOutFrame The AudioSamples we decode.  
 * @param	packet The packet we're attempting to decode from.  
 *  
 * @return	number of bytes actually processed from the packet, or negative 
 *		 for error  
 */
  public int decodeVideo(IVideoPicture pOutFrame, IPacket packet, int byteOffset) {
    return XugglerJNI.IStreamCoder_decodeVideo(swigCPtr, this, IVideoPicture.getCPtr(pOutFrame), pOutFrame, IPacket.getCPtr(packet), packet, byteOffset);
  }

/**
 * Encode the given frame using this StreamCoder.  
 * The VideoPicture will allocate a buffer to use internally for this, 
 * and  
 * will free it when the frame destroys itself.  
 * Also, when done in order to flush the encoder, caller should call 
 *  
 * this method passing in 0 (null) for pFrame to tell the encoder  
 * to flush any data it was keeping a hold of.  
 * @param	pOutPacket [out] The packet to encode into. It will point 
 *		  
 * to a buffer allocated in the frame. Caller should check IPacket::isComplete() 
 *  
 * after call to find out if we had enough information to encode a full 
 * packet.  
 * @param	pFrame [in/out] The frame to encode  
 * @param	suggestedBufferSize The suggested buffer size to allocate 
 *		 or -1 for choose ourselves.  
 * If -1 we'll allocate a buffer exactly the same size (+1) as the decoded 
 * frame  
 * with the guess that you're encoding a frame because you want to use 
 * LESS space  
 * than that.  
 * return >= 0 on success; <0 on error.  
 */
  public int encodeVideo(IPacket pOutPacket, IVideoPicture pFrame, int suggestedBufferSize) {
    return XugglerJNI.IStreamCoder_encodeVideo(swigCPtr, this, IPacket.getCPtr(pOutPacket), pOutPacket, IVideoPicture.getCPtr(pFrame), pFrame, suggestedBufferSize);
  }

/**
 * Encode the given samples using this StreamCoder.  
 * The VideoPicture will allocate a buffer to use internally for this, 
 * and  
 * will free it when the frame destroys itself.  
 * Callers should call this repeatedly on a set of samples until  
 * we consume all the samples.  
 * Also, when done in order to flush the encoder, caller should call 
 *  
 * this method passing in 0 (null) for pSamples to tell the encoder 
 *  
 * to flush any data it was keeping a hold of.  
 * @param	pOutPacket [out] The packet to encode into. It will point 
 *		  
 * to a buffer allocated in the frame. Caller should check IPacket::isComplete() 
 *  
 * after call to find out if we had enough information to encode a full 
 * packet.  
 * @param	pSamples [in] The samples to consume  
 * @param	sampleToStartFrom [in] Which sample you want to start with 
 *		  
 * This is usually zero, but if you're using a codec that  
 * packetizes output with small number of samples, you may  
 * need to call encodeAudio repeatedly with different starting  
 * samples to consume all of your samples.  
 * @return	number of samples we consumed when encoding, or negative 
 *		 for errors.  
 */
  public int encodeAudio(IPacket pOutPacket, IAudioSamples pSamples, long sampleToStartFrom) {
    return XugglerJNI.IStreamCoder_encodeAudio(swigCPtr, this, IPacket.getCPtr(pOutPacket), pOutPacket, IAudioSamples.getCPtr(pSamples), pSamples, sampleToStartFrom);
  }

/**
 * Create a standalone StreamCoder that can decode data without regard 
 * to  
 * which IStream or IContainer it came from.  
 * <p>  
 * If you're reading or writing to a XUGGLER file or URL you almost 
 * definitely  
 * don't want to use this method. Use the {@link IContainer#getStream(long)} 
 *  
 * and {@link IStream#getStreamCoder()} methods instead as it will set 
 * up the  
 * resulting IStreamCoder with sensible defaults. Use of a un-attached 
 *  
 * StreamCoder returned from this method is for advanced users only. 
 *  
 * </p>  
 * @param	direction The direction this StreamCoder will work in.  
 * @return	a new stream coder, or null if error.  
 */
  public static IStreamCoder make(IStreamCoder.Direction direction) {
    long cPtr = XugglerJNI.IStreamCoder_make__SWIG_0(direction.swigValue());
    return (cPtr == 0) ? null : new IStreamCoder(cPtr, false);
  }

/**
 * Returns the 4-byte FOURCC tag (Least Significant Byte first).  
 * This is really a packed 4-byte array so it's only useful if you use 
 *  
 * bit-wise operations on it. Some language wrappings may provide more 
 *  
 * obvious ways of manipulating, but this is the safest way to do this 
 * that  
 * will work with all wrappers.  
 * @return	the FOURCC tag.  
 */
  public int getCodecTag() {
    return XugglerJNI.IStreamCoder_getCodecTag(swigCPtr, this);
  }

/**
 * Set the 4-byte FOURCC tag for this coder.  
 * @param	fourcc The FOURCC to set, with Least Significant Byte first. 
 *		  
 */
  public void setCodecTag(int fourcc) {
    XugglerJNI.IStreamCoder_setCodecTag(swigCPtr, this, fourcc);
  }

/**
 * Returns the total number of settable properties on this object  
 * @return	total number of options (not including constant definitions) 
 *		  
 */
  public int getNumProperties() {
    return XugglerJNI.IStreamCoder_getNumProperties(swigCPtr, this);
  }

/**
 * Returns the name of the numbered property.  
 * @param	propertyNo The property number in the options list.  
 * @return	an IProperty value for this properties meta-data  
 */
  public IProperty getPropertyMetaData(int propertyNo) {
    long cPtr = XugglerJNI.IStreamCoder_getPropertyMetaData__SWIG_0(swigCPtr, this, propertyNo);
    return (cPtr == 0) ? null : new IProperty(cPtr, false);
  }

/**
 * Returns the name of the numbered property.  
 * @param	name The property name.  
 * @return	an IProperty value for this properties meta-data  
 */
  public IProperty getPropertyMetaData(String name) {
    long cPtr = XugglerJNI.IStreamCoder_getPropertyMetaData__SWIG_1(swigCPtr, this, name);
    return (cPtr == 0) ? null : new IProperty(cPtr, false);
  }

/**
 * Sets a property on this Object.  
 * All AVOptions supported by the underlying AVClass are supported. 
 *  
 * @param	name The property name. For example "b" for bit-rate.  
 * @param	value The value of the property.  
 * @return	>= 0 if the property was successfully set; <0 on error  
 */
  public int setProperty(String name, String value) {
    return XugglerJNI.IStreamCoder_setProperty__SWIG_0(swigCPtr, this, name, value);
  }

/**
 * Looks up the property 'name' and sets the  
 * value of the property to 'value'.  
 * @param	name name of option  
 * @param	value Value of option  
 * @return	>= 0 on success; <0 on error.  
 */
  public int setProperty(String name, double value) {
    return XugglerJNI.IStreamCoder_setProperty__SWIG_1(swigCPtr, this, name, value);
  }

/**
 * Looks up the property 'name' and sets the  
 * value of the property to 'value'.  
 * @param	name name of option  
 * @param	value Value of option  
 * @return	>= 0 on success; <0 on error.  
 */
  public int setProperty(String name, long value) {
    return XugglerJNI.IStreamCoder_setProperty__SWIG_2(swigCPtr, this, name, value);
  }

/**
 * Looks up the property 'name' and sets the  
 * value of the property to 'value'.  
 * @param	name name of option  
 * @param	value Value of option  
 * @return	>= 0 on success; <0 on error.  
 */
  public int setProperty(String name, boolean value) {
    return XugglerJNI.IStreamCoder_setProperty__SWIG_3(swigCPtr, this, name, value);
  }

/**
 * Looks up the property 'name' and sets the  
 * value of the property to 'value'.  
 * @param	name name of option  
 * @param	value Value of option  
 * @return	>= 0 on success; <0 on error.  
 */
  public int setProperty(String name, IRational value) {
    return XugglerJNI.IStreamCoder_setProperty__SWIG_4(swigCPtr, this, name, IRational.getCPtr(value), value);
  }

/**
 * Gets a property on this Object.  
 * Note for C++ callers; you must free the returned array with  
 * delete[] in order to avoid a memory leak. Other language  
 * folks need not worry.  
 * @param	name property name  
 * @return	an string copy of the option value, or null if the option 
 *		 doesn't exist.  
 */
  public String getPropertyAsString(String name) {
    return XugglerJNI.IStreamCoder_getPropertyAsString(swigCPtr, this, name);
  }

/**
 * Gets the value of this property, and returns as a double;  
 * @param	name name of option  
 * @return	double value of property, or 0 on error.  
 */
  public double getPropertyAsDouble(String name) {
    return XugglerJNI.IStreamCoder_getPropertyAsDouble(swigCPtr, this, name);
  }

/**
 * Gets the value of this property, and returns as an long;  
 * @param	name name of option  
 * @return	long value of property, or 0 on error.  
 */
  public long getPropertyAsLong(String name) {
    return XugglerJNI.IStreamCoder_getPropertyAsLong(swigCPtr, this, name);
  }

/**
 * Gets the value of this property, and returns as an IRational;  
 * @param	name name of option  
 * @return	long value of property, or 0 on error.  
 */
  public IRational getPropertyAsRational(String name) {
    long cPtr = XugglerJNI.IStreamCoder_getPropertyAsRational(swigCPtr, this, name);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

/**
 * Gets the value of this property, and returns as a boolean  
 * @param	name name of option  
 * @return	boolean value of property, or false on error.  
 */
  public boolean getPropertyAsBoolean(String name) {
    return XugglerJNI.IStreamCoder_getPropertyAsBoolean(swigCPtr, this, name);
  }

/**
 * Returns true if this IStreamCoder is currently open.  
 * @return	true if open; false if not  
 */
  public boolean isOpen() {
    return XugglerJNI.IStreamCoder_isOpen(swigCPtr, this);
  }

/**
 * Get the default audio frame size (in samples).  
 * Some codecs, especially raw codecs, like PCM, don't have  
 * a standard frame size. In those cases, we use the value  
 * of this setting to determine how many samples to encode into  
 * a single packet.  
 * @return	the number of samples in an audio frame size if the codec 
 *		  
 * doesn't specify the size.  
 */
  public int getDefaultAudioFrameSize() {
    return XugglerJNI.IStreamCoder_getDefaultAudioFrameSize(swigCPtr, this);
  }

/**
 * Set the default audio frame size.  
 * @param	aNewSize The new number of samples to use to encode  
 * samples into a packet. This setting is ignored if <= 0  
 *  
 * @see		#getDefaultAudioFrameSize()  
 */
  public void setDefaultAudioFrameSize(int aNewSize) {
    XugglerJNI.IStreamCoder_setDefaultAudioFrameSize(swigCPtr, this, aNewSize);
  }

/**
 * Creates a new IStreamCoder object by copying all the settings in 
 * copyCoder.  
 * <p>  
 * The new IStreamCoder is created by copying all the current properties 
 * on the  
 * passed in StreamCoder. If the passed in stream coder is in a different 
 * direction  
 * than the one you want, this method still set the same codec ID, and 
 * the  
 * IStreamCoder.open() method will check then to see if it can work 
 * in the  
 * specified direction.  
 * </p>  
 * <p>  
 * For example, imagine that direction is ENCODING and the copyCoder 
 * is a DECODING StreamCoder that is  
 * of the CODEC_ID_VP6 type. The resulting new IStreamCoder has it's 
 * code set to CODEC_ID_VP6. However  
 * (as of the writing of this comment) we don't support encoding to 
 * CODEC_ID_VP6, so when you  
 * try to open the codec we will fail.  
 * </p>  
 * @param	direction The direction you want the new IStreamCoder to work 
 *		 in.  
 * @param	copyCoder The coder to copy settings from.  
 * @return	A new IStreamCoder, or null on error.  
 */
  public static IStreamCoder make(IStreamCoder.Direction direction, IStreamCoder copyCoder) {
    long cPtr = XugglerJNI.IStreamCoder_make__SWIG_1(direction.swigValue(), IStreamCoder.getCPtr(copyCoder), copyCoder);
    return (cPtr == 0) ? null : new IStreamCoder(cPtr, false);
  }

/**
 * Get the number of frames this StreamCoder had to drop to  
 * encode at the specified {@link #getTimeBase()}  
 * <p>  
 * IStreamCoder objects can encode audio and video, but  
 * guarantee that every packet outputted has monotonically  
 * increasing timestamps (i.e. 0, 1, 2, 3, 4, 5, etc. without  
 * repeats). Sometimes data is passed too quickly into an  
 * IStreamCoder via {@link #encodeVideo} or {@link #encodeAudio},  
 *  
 *  
 * </p>  
 * <p>  
 * If you're seeing a lot of dropped frames you can try either  
 * sending less frequent data to the IStreamCoder, or adjusting  
 * the {@link #getTimeBase()} to the highest possible resolution.  
 * Be warned though; some codecs (such as MPEG2) require fixed  
 * time-bases (like 1/25) and so setting a higher resolution  
 * time base might end up with the codec not able to encode  
 * any data.  
 * </p>  
 * @return	the number of frames dropped.  
 */
  public long getNumDroppedFrames() {
    return XugglerJNI.IStreamCoder_getNumDroppedFrames(swigCPtr, this);
  }

  public enum Direction {
  /**
   * The Direction in which this StreamCoder will work.
   */
    ENCODING,
    DECODING;

    public final int swigValue() {
      return swigValue;
    }

    public static Direction swigToEnum(int swigValue) {
      Direction[] swigValues = Direction.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Direction swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Direction.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Direction() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Direction(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Direction(Direction swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum Flags {
  /**
   * XUGGLER Flags that can be passed to the setFlag(Flags, bool) method 
   *
   */
    FLAG_QSCALE(XugglerJNI.IStreamCoder_FLAG_QSCALE_get()),
    FLAG_4MV(XugglerJNI.IStreamCoder_FLAG_4MV_get()),
    FLAG_QPEL(XugglerJNI.IStreamCoder_FLAG_QPEL_get()),
    FLAG_GMC(XugglerJNI.IStreamCoder_FLAG_GMC_get()),
    FLAG_MV0(XugglerJNI.IStreamCoder_FLAG_MV0_get()),
    FLAG_PART(XugglerJNI.IStreamCoder_FLAG_PART_get()),
    FLAG_INPUT_PRESERVED(XugglerJNI.IStreamCoder_FLAG_INPUT_PRESERVED_get()),
    FLAG_PASS1(XugglerJNI.IStreamCoder_FLAG_PASS1_get()),
    FLAG_PASS2(XugglerJNI.IStreamCoder_FLAG_PASS2_get()),
    FLAG_EXTERN_HUFF(XugglerJNI.IStreamCoder_FLAG_EXTERN_HUFF_get()),
    FLAG_GRAY(XugglerJNI.IStreamCoder_FLAG_GRAY_get()),
    FLAG_EMU_EDGE(XugglerJNI.IStreamCoder_FLAG_EMU_EDGE_get()),
    FLAG_PSNR(XugglerJNI.IStreamCoder_FLAG_PSNR_get()),
    FLAG_TRUNCATED(XugglerJNI.IStreamCoder_FLAG_TRUNCATED_get()),
    FLAG_NORMALIZE_AQP(XugglerJNI.IStreamCoder_FLAG_NORMALIZE_AQP_get()),
    FLAG_INTERLACED_DCT(XugglerJNI.IStreamCoder_FLAG_INTERLACED_DCT_get()),
    FLAG_LOW_DELAY(XugglerJNI.IStreamCoder_FLAG_LOW_DELAY_get()),
    FLAG_ALT_SCAN(XugglerJNI.IStreamCoder_FLAG_ALT_SCAN_get()),
    FLAG_TRELLIS_QUANT(XugglerJNI.IStreamCoder_FLAG_TRELLIS_QUANT_get()),
    FLAG_GLOBAL_HEADER(XugglerJNI.IStreamCoder_FLAG_GLOBAL_HEADER_get()),
    FLAG_BITEXACT(XugglerJNI.IStreamCoder_FLAG_BITEXACT_get()),
    FLAG_AC_PRED(XugglerJNI.IStreamCoder_FLAG_AC_PRED_get()),
    FLAG_H263P_UMV(XugglerJNI.IStreamCoder_FLAG_H263P_UMV_get()),
    FLAG_CBP_RD(XugglerJNI.IStreamCoder_FLAG_CBP_RD_get()),
    FLAG_QP_RD(XugglerJNI.IStreamCoder_FLAG_QP_RD_get()),
    FLAG_H263P_AIV(XugglerJNI.IStreamCoder_FLAG_H263P_AIV_get()),
    FLAG_OBMC(XugglerJNI.IStreamCoder_FLAG_OBMC_get()),
    FLAG_LOOP_FILTER(XugglerJNI.IStreamCoder_FLAG_LOOP_FILTER_get()),
    FLAG_H263P_SLICE_STRUCT(XugglerJNI.IStreamCoder_FLAG_H263P_SLICE_STRUCT_get()),
    FLAG_INTERLACED_ME(XugglerJNI.IStreamCoder_FLAG_INTERLACED_ME_get()),
    FLAG_SVCD_SCAN_OFFSET(XugglerJNI.IStreamCoder_FLAG_SVCD_SCAN_OFFSET_get()),
    FLAG_CLOSED_GOP(XugglerJNI.IStreamCoder_FLAG_CLOSED_GOP_get()),
    FLAG2_FAST(XugglerJNI.IStreamCoder_FLAG2_FAST_get()),
    FLAG2_STRICT_GOP(XugglerJNI.IStreamCoder_FLAG2_STRICT_GOP_get()),
    FLAG2_NO_OUTPUT(XugglerJNI.IStreamCoder_FLAG2_NO_OUTPUT_get()),
    FLAG2_LOCAL_HEADER(XugglerJNI.IStreamCoder_FLAG2_LOCAL_HEADER_get()),
    FLAG2_BPYRAMID(XugglerJNI.IStreamCoder_FLAG2_BPYRAMID_get()),
    FLAG2_WPRED(XugglerJNI.IStreamCoder_FLAG2_WPRED_get()),
    FLAG2_MIXED_REFS(XugglerJNI.IStreamCoder_FLAG2_MIXED_REFS_get()),
    FLAG2_8X8DCT(XugglerJNI.IStreamCoder_FLAG2_8X8DCT_get()),
    FLAG2_FASTPSKIP(XugglerJNI.IStreamCoder_FLAG2_FASTPSKIP_get()),
    FLAG2_AUD(XugglerJNI.IStreamCoder_FLAG2_AUD_get()),
    FLAG2_BRDO(XugglerJNI.IStreamCoder_FLAG2_BRDO_get()),
    FLAG2_INTRA_VLC(XugglerJNI.IStreamCoder_FLAG2_INTRA_VLC_get()),
    FLAG2_MEMC_ONLY(XugglerJNI.IStreamCoder_FLAG2_MEMC_ONLY_get()),
    FLAG2_DROP_FRAME_TIMECODE(XugglerJNI.IStreamCoder_FLAG2_DROP_FRAME_TIMECODE_get()),
    FLAG2_SKIP_RD(XugglerJNI.IStreamCoder_FLAG2_SKIP_RD_get()),
    FLAG2_CHUNKS(XugglerJNI.IStreamCoder_FLAG2_CHUNKS_get()),
    FLAG2_NON_LINEAR_QUANT(XugglerJNI.IStreamCoder_FLAG2_NON_LINEAR_QUANT_get()),
    FLAG2_BIT_RESERVOIR(XugglerJNI.IStreamCoder_FLAG2_BIT_RESERVOIR_get());

    public final int swigValue() {
      return swigValue;
    }

    public static Flags swigToEnum(int swigValue) {
      Flags[] swigValues = Flags.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Flags swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Flags.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Flags() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Flags(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Flags(Flags swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
