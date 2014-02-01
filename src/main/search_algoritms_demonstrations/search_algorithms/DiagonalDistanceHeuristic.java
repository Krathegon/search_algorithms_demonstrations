/*
 * Copyright 2010, 2013, 2014 Luis Henrique Oliveira Rios
 *
 * This file is part of Search Algorithms Demonstrations.
 *
 * Search Algorithms Demonstrations is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Search Algorithms Demonstrations is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Search Algorithms Demonstrations.  If not, see <http://www.gnu.org/licenses/>.
 */

package search_algoritms_demonstrations.search_algorithms;

import search_algoritms_demonstrations.maze.MazeCell;

public class DiagonalDistanceHeuristic implements Heuristic {
	/* Public: */
	public static DiagonalDistanceHeuristic getInstance() {
		if (diagonal_distance_heuristic == null) {
			diagonal_distance_heuristic = new DiagonalDistanceHeuristic();
		}
		return diagonal_distance_heuristic;
	}

	@Override
	public int distanceToGoal(MazeCell maze_cell, MazeCell goal) {
		return DistanceCalculator.diagonalDistance(maze_cell.getX(), maze_cell.getY(), goal.getX(), goal.getY());
	}

	/* Private: */
	private static DiagonalDistanceHeuristic diagonal_distance_heuristic = null;

	private DiagonalDistanceHeuristic() {
	}
}
