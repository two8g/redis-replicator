# Key
* DEL key [key ...]
	* Delete a key
* EXPIRE key seconds
	* Set a key's time to live in seconds
* EXPIREAT key timestamp
	* Set the expiration for a key as a UNIX timestamp
* MOVE key db
	* Move a key to another database
* PERSIST key
	* Remove the expiration from a key
* PEXPIRE key milliseconds
	* Set a key's time to live in milliseconds
* PEXPIREAT key milliseconds-timestamp
	* Set the expiration for a key as a UNIX timestamp specified in milliseconds
* RENAME key newkey
	* Rename a key
* RENAMENX key newkey
	* Rename a key, only if the new key does not exist
* UNLINK key [key ...]
	* Delete a key asynchronously in another thread. Otherwise it is just as DEL, but non blocking.

# String
* APPEND key value
	* Append a value to a key
* DECR key
	* Decrement the integer value of a key by one
* DECRBY key decrement
	* Decrement the integer value of a key by the given number
* GETSET key value
	* Set the string value of a key and return its old value
* INCR key
	* Increment the integer value of a key by one
* INCRBY key increment
	* Increment the integer value of a key by the given amount
* INCRBYFLOAT key increment
	* Increment the float value of a key by the given amount
* MSET key value [key value ...]
	* Set multiple keys to multiple values
* MSETNX key value [key value ...]
	* Set multiple keys to multiple values, only if none of the keys exist
* PSETEX key milliseconds value
	* Set the value and expiration in milliseconds of a key
* SET key value [EX seconds|PX milliseconds] [NX|XX]
	* Set the string value of a key
* SETBIT key offset value
	* Sets or clears the bit at offset in the string value stored at key
* SETEX key seconds value
	* Set the value and expiration of a key
* SETNX key value
	* Set the value of a key, only if the key does not exist
* SETRANGE key offset value
	* Overwrite part of a string at key starting at the specified offset

# Hash
* HDEL key field [field ...]
	* Delete one or more hash fields
* HINCRBY key field increment
	* Increment the integer value of a hash field by the given number
* HINCRBYFLOAT key field increment
	* Increment the float value of a hash field by the given amount
* HMSET key field value [field value ...]
	* Set multiple hash fields to multiple values
* HSET key field value [field value ...]
	* Set the string value of a hash field
* HSETNX key field value
	* Set the value of a hash field, only if the field does not exist

# List

* BLPOP key [key ...] timeout
	* Remove and get the first element in a list, or block until one is available
* BRPOP key [key ...] timeout
	* Remove and get the last element in a list, or block until one is available
* BRPOPLPUSH source destination timeout
	* Pop an element from a list, push it to another list and return it; or block until one is available
* LINSERT key BEFORE|AFTER pivot element
	* Insert an element before or after another element in a list
* LPOP key
	* Remove and get the first element in a list
* LPUSH key element [element ...]
	* Prepend one or multiple elements to a list
* LPUSHX key element [element ...]
	* Prepend an element to a list, only if the list exists
* LREM key count element
	* Remove elements from a list
* LSET key index element
	* Set the value of an element in a list by its index
* LTRIM key start stop
	* Trim a list to the specified range
* RPOP key
	* Remove and get the last element in a list
* RPOPLPUSH source destination
	* Remove the last element in a list, prepend it to another list and return it
* RPUSH key element [element ...]
	* Append one or multiple elements to a list
* RPUSHX key element [element ...]
	* Append an element to a list, only if the list exists

# Set
* SADD key member [member ...]
	* Add one or more members to a set
* SDIFFSTORE destination key [key ...]
	* Subtract multiple sets and store the resulting set in a key
* SELECT index
	* Change the selected database for the current connection
* SINTERSTORE destination key [key ...]
	* Intersect multiple sets and store the resulting set in a key
* SMOVE source destination member
	* Move a member from one set to another
* SPOP key [count]
	* Remove and return one or multiple random members from a set
* SREM key member [member ...]
	* Remove one or more members from a set
* SUBSCRIBE channel [channel ...]
	* Listen for messages published to the given channels
* SUNIONSTORE destination key [key ...]
	* Add multiple sets and store the resulting set in a key

# Sorted Set
* BZPOPMIN key [key ...] timeout
	* Remove and return the member with the lowest score from one or more sorted sets, or block until one is available
* BZPOPMAX key [key ...] timeout
	* Remove and return the member with the highest score from one or more sorted sets, or block until one is available Get array of Cluster slot to node mappings
* ZINTERSTORE destination numkeys key [key ...] [WEIGHTS weight [weight ...]] [AGGREGATE SUM|MIN|MAX]
	* Intersect multiple sorted sets and store the resulting sorted set in a new key
* ZUNIONSTORE destination numkeys key [key ...] [WEIGHTS weight [weight ...]] [AGGREGATE SUM|MIN|MAX]
	* Add multiple sorted sets and store the resulting sorted set in a new key
* ZADD key [NX|XX] [CH] [INCR] score member [score member ...]
	* Add one or more members to a sorted set, or update its score if it already exists
* ZINCRBY key increment member
	* Increment the score of a member in a sorted set
* ZPOPMAX key [count]
	* Remove and return members with the highest scores in a sorted set
* ZPOPMIN key [count]
	* Remove and return members with the lowest scores in a sorted set
* ZREM key member [member ...]
	* Remove one or more members from a sorted set
* ZREMRANGEBYLEX key min max
	* Remove all members in a sorted set between the given lexicographical range
* ZREMRANGEBYRANK key start stop
	* Remove all members in a sorted set within the given indexes
* ZREMRANGEBYSCORE key min max
	* Remove all members in a sorted set within the given scores


# DELETE

* DEL/UNLINK
    * {"keys":["YQ==","Yg=="]}

# UPDATE

* APPEND
    * {"key":"YQ==","value":"MQ=="}
* MSET/MSETNX
    * {"kv":{"YWFh":"MQ==","YmJi":"Mg=="}}
* SET/GETSET/PSETEX/SETNX
    * {"key":"YQ==","value":"MQ=="}
    * {"key":"YQ==","ex":111111111111,"value":"MQ=="}
* DECR/DECRBY/INCR/INCRBY/INCRBYFLOAT
    * {"key":"YQ=="}
    * {"key":"YQ==","value":1}

* HSET/HMSET/HSETNX
    * {"key":"Yg==","field":"YQ==","value":"MQ=="}
* HINCRBY/HINCRBYFLOAT
    * {"key":"Yg==","field":"YQ==","increment":1}