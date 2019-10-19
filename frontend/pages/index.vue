<template>
  <v-row align="center" justify="center">
    <v-col cols="6">
      <v-card elevation="8">
        <v-img aspect-ratio="2" :src="src"> </v-img>
      </v-card>
    </v-col>
  </v-row>
</template>

<script>
export default {
  data: () => ({
    loading: true,
    src: "",
  }),
  mounted() {
    this.getRandomSource()
  },
  methods: {
    getRandomSource() {
      this.loading = true

      this.$axios
        .get(`https://picsum.photos/1920/1080`)
        .then((it) => (this.src = it.request.responseURL))
        .finally((this.loading = false))
    },
  },
}
</script>
