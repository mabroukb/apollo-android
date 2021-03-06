// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragments_with_type_condition_nullable.fragment

import com.apollographql.apollo.api.GraphqlFragment
import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.ResponseFieldMarshaller
import com.apollographql.apollo.api.ResponseReader
import kotlin.Array
import kotlin.Double
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter")
data class HumanDetails(
  val __typename: String = "Human",
  /**
   * What this human calls themselves
   */
  val name: String,
  /**
   * Height in the preferred unit, default is meters
   */
  val height: Double?
) : GraphqlFragment {
  override fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller {
    it.writeString(RESPONSE_FIELDS[0], __typename)
    it.writeString(RESPONSE_FIELDS[1], name)
    it.writeDouble(RESPONSE_FIELDS[2], height)
  }

  companion object {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forString("name", "name", null, false, null),
        ResponseField.forDouble("height", "height", null, true, null)
        )

    val FRAGMENT_DEFINITION: String = """
        |fragment HumanDetails on Human {
        |  __typename
        |  name
        |  height
        |}
        """.trimMargin()

    operator fun invoke(reader: ResponseReader): HumanDetails {
      val __typename = reader.readString(RESPONSE_FIELDS[0])
      val name = reader.readString(RESPONSE_FIELDS[1])
      val height = reader.readDouble(RESPONSE_FIELDS[2])
      return HumanDetails(
        __typename = __typename,
        name = name,
        height = height
      )
    }
  }
}
