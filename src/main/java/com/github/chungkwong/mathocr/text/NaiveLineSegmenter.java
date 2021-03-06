/*
 * Copyright (C) 2018 Chan Chung Kwong
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.chungkwong.mathocr.text;
import com.github.chungkwong.mathocr.layout.physical.*;
import java.util.*;
/**
 * Assume that only one line present
 *
 * @author Chan Chung Kwong
 */
public class NaiveLineSegmenter implements LineSegmenter{
	public static final String NAME="NAIVE";
	@Override
	public List<TextLine> segment(PhysicalBlock block){
		ArrayList<TextLine> lines=new ArrayList<>(1);
		lines.add(new TextLine(block.getComponents(),block.getBox(),TextLine.ALIGN_FULL));
		return lines;
	}
}
