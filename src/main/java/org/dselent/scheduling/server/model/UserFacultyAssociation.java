package org.dselent.scheduling.server.model;

import java.sql.JDBCType;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserFacultyAssociation extends Model{
	public static final String TABLE_NAME = "user_faculty_association";
	
	public static enum Columns{
		ID,
		USER_ID,
		FACULTY_ID,
		CREATED_AT
	}
	
	// enum list
		private static final List<Columns> COLUMN_LIST = new ArrayList<>();
		
		// type mapping
		private static final Map<Columns, JDBCType> COLUMN_TYPE_MAP = new HashMap<>();
		
		static
		{
			for(Columns key : Columns.values())
			{
				COLUMN_LIST.add(key);
			}
			
			COLUMN_TYPE_MAP.put(Columns.ID, JDBCType.INTEGER);
			COLUMN_TYPE_MAP.put(Columns.USER_ID, JDBCType.INTEGER);
			COLUMN_TYPE_MAP.put(Columns.FACULTY_ID, JDBCType.INTEGER);
			COLUMN_TYPE_MAP.put(Columns.CREATED_AT, JDBCType.TIMESTAMP_WITH_TIMEZONE);
		};	
		
		private Integer id;
		private Integer userId;
		private Integer facultyId;
		private Instant createdAt;
		
		public static JDBCType getColumnType(Columns column)
		{
			return COLUMN_TYPE_MAP.get(column);
		}
		
		public static String getColumnName(Columns column)
		{
			return column.toString().toLowerCase();
		}
		
		public static List<String> getColumnNameList()
		{
			List<String> columnNameList = new ArrayList<>();
			
			for(Columns column : COLUMN_LIST)
			{
				columnNameList.add(getColumnName(column));
			}
			
			return columnNameList;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getUserId() {
			return userId;
		}

		public void setUserId(Integer userId) {
			this.userId = userId;
		}

		public Integer getFacultyId() {
			return facultyId;
		}

		public void setFacultyId(Integer facultyId) {
			this.facultyId = facultyId;
		}

		public Instant getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Instant createdAt) {
			this.createdAt = createdAt;
		}
		
		public void setCreatedAt(Timestamp createdAt) {
			this.createdAt = createdAt.toInstant();
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
			result = prime * result + ((facultyId == null) ? 0 : facultyId.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((userId == null) ? 0 : userId.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			UserFacultyAssociation other = (UserFacultyAssociation) obj;
			if (createdAt == null) {
				if (other.createdAt != null)
					return false;
			} else if (!createdAt.equals(other.createdAt))
				return false;
			if (facultyId == null) {
				if (other.facultyId != null)
					return false;
			} else if (!facultyId.equals(other.facultyId))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (userId == null) {
				if (other.userId != null)
					return false;
			} else if (!userId.equals(other.userId))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "UserFacultyAssociation [id=" + id + ", userId=" + userId + ", facultyId=" + facultyId
					+ ", createdAt=" + createdAt + "]";
		}
		
		
}
