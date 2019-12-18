<template>
  <v-row align="center" justify="center">
    <v-col cols="6">
      <v-card elevation="8">
        <p>{{ src }}</p>
      </v-card>
    </v-col>
  </v-row>
</template>

<script>
import axios from "axios"

const AXIOS = axios.create({
  baseURL: "http://localhost:1337/api/config/",
})

const config = {
  headers: { "Access-Control-Allow-Origin": "*", "Content-Type": "application/json" },
}

export default {
  data: () => ({
    src: null,
  }),
  mounted() {
    this.getRandomSource()
  },
  methods: {
    getRandomSource() {
      return AXIOS.get("/all", config).then((it) => {
        this.src = it.data
      })
    },
  },
}
</script>
