package cn.ms.compress;

import java.io.IOException;

/**
 * The Data Compress/UnCompress.<br>
 * <br>
 * env:JDK:1.7/CPU:4C/Compress Times：2000times<br>
 * <br>
 * <table border="1">
 * <tr><td>Format</td><td>Size Before(byte)</td><td>Size After(byte)</td><td>Compress Expend(ms)</td><td>UnCompress Expend(ms)</td><td>MAX CPU(%)</td></tr>
 * <tr><td>bzip2</td><td>35984</td><td>8677</td><td>11591</td><td>2362</td><td>29.5</td></tr>
 * <tr><td>gzip</td><td>35984</td><td>8804</td><td>2179</td><td>389</td><td>26.5</td></tr>
 * <tr><td>deflate</td><td>35984</td><td>9704</td><td>680</td><td>344</td><td>20.5</td></tr>
 * <tr><td>lzo</td><td>35984</td><td>13069</td><td>581</td><td>230</td><td>22</td></tr>
 * <tr><td>lz4</td><td>35984</td><td>16355</td><td>327</td><td>147</td><td>12.6</td></tr>
 * <tr><td>snappy</td><td>35984</td><td>13602</td><td>424</td><td>88</td><td>11</td></tr>
 * </table>
 * <br>
 * @author lry
 */
public interface Compress {

	/**
	 * The Data compress.
	 * 
	 * @param data
	 * @return
	 * @throws IOException
	 */
	byte[] compress(byte[] data) throws IOException;

	/**
	 * The Data uncompress.
	 * 
	 * @param data
	 * @return
	 * @throws IOException
	 */
	byte[] uncompress(byte[] data) throws IOException;

}
