/*
 *  Copyright 2018 Secure, Reliable, and Intelligent Systems Lab, ETH Zurich
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */


package ch.securify.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.xml.bind.DatatypeConverter;

public class FileUtil {


	/**
	 * Read the contents (first line) of a file that contains binary content in a hexadecimal format.
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public static byte[] readHexFile(File file) throws IOException {
		String hexcode = Files.readAllLines(file.toPath()).get(0);
		return DatatypeConverter.parseHexBinary(hexcode);
	}


}
